package com.bitboxer2.PruebaAPI.model;

public class Supplier {
    private String name;
    private String country;

    // Constructors, getters, and setters

    public Supplier(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
