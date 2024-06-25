package com.BY.ParcelServices.controller;

import com.BY.ParcelServices.entity.Parcelinfo;
import com.BY.ParcelServices.service.ParcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/parcel")
public class ParcelController {
    @Autowired
    private ParcelService parcelService;

    @PostMapping("/addparcel")
    public Parcelinfo addParcel(@RequestBody Parcelinfo parcel) {
        return parcelService.addParcel(parcel);
    }
    @GetMapping("/getparcel/{id}")
    public Parcelinfo getParcelById(@PathVariable("id") int id) {
        return parcelService.getParcelById(id);
    }
    @GetMapping("/getparcelbytype/{parcletype}")
    public List<Parcelinfo> getParcelByType(@PathVariable("parcletype") String parcletype) {
        List<String> parcelTypes = Arrays.asList(parcletype.split(","));
        return parcelService.getParcelByParcletype(parcelTypes);
    }

    @GetMapping("vendor/{vendorid}")
    public ResponseEntity<List<Parcelinfo>> getAccountByBankId(@PathVariable("vendorid") int vendorId){
        return ResponseEntity.ok(parcelService.getParcelinfoByVendorinfoId(vendorId));
    }

}
