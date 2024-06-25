package com.BY.Vendorservices.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FullResponse {
    public String vendorName;
    public String vendorAddress;
    public String contactNumber;
    public String email;
    public String operationalHours;
    public String[] supportedRegions;
    List<Parcelinfo> parcelinfo;
}
