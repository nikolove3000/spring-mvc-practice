package com.example.model;

/**
 * Represents a product with a name and price.
 */
public class Product {

    private String name;
    private double price;


    /**
     * Creates an empty Product instance.
     */
    public Product() {
    }


    /**
     * Returns the product name.
     * @return product name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the product name.
     * @param name product name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the product price.
     * @return product price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the product price.
     * @param price product price
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
