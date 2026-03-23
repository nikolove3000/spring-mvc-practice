package com.example.exception;

/**
 * Exception thrown when a product cannot be found by its id.
 */
public class ProductNotFoundException extends RuntimeException{

    /**
     * Creates a new ProductNotFoundException with a detailed error message.
     * @param id the id of the product that could not be found
     */
    public ProductNotFoundException(int id) {
        super("Product with ID = " + id + " not found");
    }
}
