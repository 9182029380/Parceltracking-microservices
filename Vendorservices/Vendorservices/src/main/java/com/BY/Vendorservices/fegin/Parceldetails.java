package com.BY.Vendorservices.fegin;

import com.BY.Vendorservices.config.Parcelinfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="Parcel-Services",url="http://localhost:9097/parcel")
public interface Parceldetails {
    @GetMapping("/vendor/{vendorid}")
    List<Parcelinfo> findAllParcelinfoByVendorinfo(@PathVariable("vendorid") int id);

}
