package com.rent.rank.model;

import org.springframework.data.mongodb.core.geo.GeoJsonPoint;

import java.util.List;

public class House extends Home {

    private String id;

    private String address;
    private GeoJsonPoint location;
    private int numFloors;
    private int year;
    private List<Rent> renters;


    // TODO chalet, adosada, semiadosada


    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

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
