package com.rent.rank.model;

import org.springframework.data.mongodb.core.geo.GeoJsonPoint;

import java.util.List;

public class House extends Home {

    private String address;
    private GeoJsonPoint location;
    private int numFloors;
    private int year;


    // TODO chalet, adosada, semiadosada

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public GeoJsonPoint getLocation() {
        return location;
    }

    public void setLocation(GeoJsonPoint location) {
        this.location = location;
    }

    public int getNumFloors() {
        return numFloors;
    }

    public void setNumFloors(int numFloors) {
        this.numFloors = numFloors;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
