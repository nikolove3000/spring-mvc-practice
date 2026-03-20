package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    @GetMapping(value =  "/products")
    public String products(Model model) {

        List<String> productsList = new ArrayList<>();
        productsList.add("Laptop");
        productsList.add("Phone");
        productsList.add("PC");

        model.addAttribute("products", productsList);

        return "products";
    }
}
