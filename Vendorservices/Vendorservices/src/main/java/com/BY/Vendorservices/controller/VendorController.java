package com.BY.Vendorservices.controller;

import com.BY.Vendorservices.config.FullResponse;
import com.BY.Vendorservices.entity.Vendorinfo;
import com.BY.Vendorservices.service.Vendorservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendor")
public class VendorController {
    @Autowired
    private Vendorservice service;

    @PostMapping("/addvendor")
    public Vendorinfo addVendor(@RequestBody Vendorinfo vendor) {
        return service.addVendor(vendor);
    }
    @GetMapping("/findallvendors")
    public List<Vendorinfo> getAllVendors() {
        return service.getAllVendors();
    }

    @GetMapping("/vendor/{vendorid}")
    public ResponseEntity<FullResponse> getVendorById(@PathVariable("vendorid") int id){
        return ResponseEntity.ok(service.getVendorById(id));
    }

    @GetMapping("/findvendorbyid/{id}")
    public Vendorinfo findVendorById(@PathVariable int id) {
        return service.findVendorById(id);
    }
}
