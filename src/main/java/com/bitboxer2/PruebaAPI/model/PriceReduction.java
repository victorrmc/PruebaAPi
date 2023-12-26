package com.bitboxer2.PruebaAPI.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Entity
@Getter @Setter
public class PriceReduction {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long priceReductionId; // Assuming a numeric value for product code
    private double reducedPrice;
    private Date startDate;
    private Date endDate;

    // Constructors, getters, and setters

    public PriceReduction(double reducedPrice, Date startDate, Date endDate) {
        this.reducedPrice = reducedPrice;
        this.startDate = startDate;
        this.endDate = endDate;
    }


}
