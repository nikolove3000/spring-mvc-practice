package com.example.model;

/**
 * Represents an order containing a product and its quantity.
 */
public class Order {

    private String productName;
    private int quantity;

    /**
     * Constructs an empty Order with default values.
     * productName will be null and quantity will be 0.
     */
    public Order() {
    }

    /**
     * Constructs a new Order with the specified product name and quantity.
     * @param productName the name of the product
     * @param quantity    the quantity of the product in the order
     */
    public Order(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }


    /**
     * Returns the name of the product in this order.
     * @return the product name
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the name of the product in this order.
     * @param productName the product name to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Returns the quantity of the product in this order.
     * @return the product quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the quantity of the product in this order.
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}