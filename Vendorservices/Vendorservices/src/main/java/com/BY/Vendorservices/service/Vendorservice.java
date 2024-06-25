package com.BY.Vendorservices.service;

import com.BY.Vendorservices.config.FullResponse;
import com.BY.Vendorservices.config.Parcelinfo;
import com.BY.Vendorservices.entity.Vendorinfo;
import com.BY.Vendorservices.fegin.Parceldetails;
import com.BY.Vendorservices.repository.Vendorrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Vendorservice {
    @Autowired
    private Vendorrepo repo;
    @Autowired
    private Parceldetails details;

    public Vendorinfo addVendor(Vendorinfo vendor) {
        return repo.save(vendor);
    }

    public List<Vendorinfo> getAllVendors() {
        return repo.findAll();
    }

    public Vendorinfo findVendorById(int id) {
        return repo.findById(id).orElse(null);
    }

    public FullResponse getVendorById(int id) {
        Vendorinfo vendor = repo.findById(id).orElse(null);
        List<Parcelinfo> p = details.findAllParcelinfoByVendorinfo(id);
            FullResponse fullResponse = new FullResponse();
            fullResponse.setVendorName(vendor.getVendorName());
            fullResponse.setVendorAddress(vendor.getVendorAddress());
            fullResponse.setContactNumber(vendor.getContactNumber());
            fullResponse.setEmail(vendor.getEmail());
            fullResponse.setOperationalHours(vendor.getOperationalHours());
            fullResponse.setSupportedRegions(vendor.getSupportedRegions());
            fullResponse.setParcelinfo(p);
            return fullResponse;
        }


    }

