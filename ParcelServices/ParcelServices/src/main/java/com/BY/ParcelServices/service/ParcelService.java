package com.BY.ParcelServices.service;

import com.BY.ParcelServices.entity.Parcelinfo;
import com.BY.ParcelServices.repository.Parcelrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParcelService {
    @Autowired
    private Parcelrepo repo;
    public Parcelinfo addParcel(Parcelinfo parcel) {
        return repo.save(parcel);
    }

    public Parcelinfo getParcelById(int id) {
        return repo.findById(id).orElse(null);
    }

    public List<Parcelinfo> getParcelByParcletype(List<String> parcletype) {
        return  repo.findByParcletypeIn(parcletype);
    }

    public List<Parcelinfo> getParcelinfoByVendorinfoId(int vendorId) {
        return repo.findByVendorId(vendorId);
    }
}
