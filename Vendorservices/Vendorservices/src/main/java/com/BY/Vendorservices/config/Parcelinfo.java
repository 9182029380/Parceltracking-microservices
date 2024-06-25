package com.BY.Vendorservices.config;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Parcelinfo {
    @Id
    public int id;//pk
    public String parcleid;
    public String parcleweight;
    public String parclestatus;
    public String parcletype;
    public String parcledestination;
    public String parclecurrentlocation;
    public String parclepickuptime;
    public String parclepickupdate;
    public double price;
    public int vendorId;//fk
}
