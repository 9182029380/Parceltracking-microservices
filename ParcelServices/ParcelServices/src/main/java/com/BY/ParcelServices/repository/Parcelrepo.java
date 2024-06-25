package com.BY.ParcelServices.repository;

import com.BY.ParcelServices.entity.Parcelinfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface Parcelrepo extends JpaRepository<Parcelinfo,Integer> {
    List<Parcelinfo> findByParcletypeIn(List<String> parcletype);

    List<Parcelinfo> findByVendorId(int vendorId);
}
