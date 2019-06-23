package com.rent.rank.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Home {

    private String id;

    private int bedrooms;
    private int bathrooms;
    private boolean terrace;
    private boolean balcony;
    private boolean garage;
    private boolean rooftop;
    private boolean pets;
    private boolean particular;
    private List<Rent> renters;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public boolean isTerrace() {
        return terrace;
    }

    public void setTerrace(boolean terrace) {
        this.terrace = terrace;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public boolean isRooftop() {
        return rooftop;
    }

    public void setRooftop(boolean rooftop) {
        this.rooftop = rooftop;
    }

    public boolean isPets() {
        return pets;
    }

    public void setPets(boolean pets) {
        this.pets = pets;
    }

    public boolean isParticular() {
        return particular;
    }

    public void setParticular(boolean particular) {
        this.particular = particular;
    }

    public List<Rent> getRenters() {
        return renters;
    }

    public void setRenters(List<Rent> renters) {
        this.renters = renters;
    }
}
