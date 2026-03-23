package com.example.controller;

import com.example.exception.ProductNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

/**
 * Controller responsible for handling product-related requests.
 */
@Controller
public class ProductController {

    /**
     * Handles requests to display the list of all products.
     * @param model the Model object used to pass data to the view
     * @return the name of the view displaying all products
     */
    @GetMapping(value =  "/products")
    public String products(Model model) {

        List<String> productsList = new ArrayList<>();
        productsList.add("Laptop");
        productsList.add("Phone");
        productsList.add("PC");

        model.addAttribute("products", productsList);

        return "products";
    }

    /**
     * Handles requests to display details of a single product by its ID.
     * Uses the index of the product list as a temporary ID.
     * @param model     the Model object used to pass data to the view
     * @param productId the ID of the product to retrieve
     * @return the name of the view displaying the product details
     * @throws ProductNotFoundException if the product ID is invalid or not found
     */
    @GetMapping(value = "/products/{id}")
    public String getProductId(Model model, @PathVariable("id") int productId) {

        List<String> productsList = List.of("Laptop", "Phone", "PC");

        if (productId < 0 || productId >= productsList.size()) {
            throw new ProductNotFoundException(productId);
        }

        String product = productsList.get(productId);
        model.addAttribute("product", product);

        return "product-detail";
    }
}
