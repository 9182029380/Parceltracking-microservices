package com.BY.ParcelServices.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "parcel")
public class Parcelinfo {
    @Id
    public int id;
    public String parcleid;
    public String parcleweight;
    public String parclestatus;
    public String parcletype;
    public String parcledestination;
    public String parclecurrentlocation;
    public String parclepickuptime;
    public String parclepickupdate;
    public double price;
    public int vendorId;


}
