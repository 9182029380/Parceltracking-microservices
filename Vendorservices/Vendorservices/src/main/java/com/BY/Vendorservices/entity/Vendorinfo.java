package com.BY.Vendorservices.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vendor_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vendorinfo {
    @Id
    public int id;
    public String vendorName;
    public String vendorAddress;
    public String contactNumber;
    public String email;
    public String serviceType;
    public double rating;
    public int yearsInBusiness;
    public String operationalHours;
    public double deliveryCharge;
    public String[] supportedRegions;


}
