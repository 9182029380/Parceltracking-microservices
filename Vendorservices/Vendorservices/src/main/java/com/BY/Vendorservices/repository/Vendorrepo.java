package com.BY.Vendorservices.repository;


import com.BY.Vendorservices.entity.Vendorinfo;
import org.springframework.data.jpa.repository.JpaRepository;



public interface Vendorrepo extends JpaRepository<Vendorinfo,Integer> {

}
