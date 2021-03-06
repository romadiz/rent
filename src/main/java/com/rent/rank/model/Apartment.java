package com.rent.rank.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Apartment extends Home{

    private long apartmentId;
    private String buildingId;
    private int floor;
    private String door;
    private String address;
    private boolean lastFloor;
    private boolean interior;

    public long getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(long apartmentId) {
        this.apartmentId = apartmentId;
    }

    public String getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(String buildingId) {
        this.buildingId = buildingId;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isLastFloor() {
        return lastFloor;
    }

    public void setLastFloor(boolean lastFloor) {
        this.lastFloor = lastFloor;
    }

    public boolean isInterior() {
        return interior;
    }

    public void setInterior(boolean interior) {
        this.interior = interior;
    }
}
