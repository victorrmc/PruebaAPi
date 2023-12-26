package com.bitboxer2.PruebaAPI.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter @Setter
public class Product {
    public enum ProductState {
        ACTIVE, DISCONTINUED
    }
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long productId; // Assuming a numeric value for product code
    private String description;
    private double price;
    private ProductState state; // Enum for state: ACTIVE or DISCONTINUED
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name="Product_supplier",
            joinColumns=
            @JoinColumn(name="product_id", referencedColumnName="productId", nullable = false),
            inverseJoinColumns=
            @JoinColumn(name="supplier_id", referencedColumnName="priceReductionId",  nullable = false)
    )
    private Supplier supplier; // Assuming one supplier for simplicity
    private PriceReduction priceReduction; // One-to-one relationship
    private Date creationDate;
    private String creator; // User who created the product

    // Constructors, getters, and setters



}
