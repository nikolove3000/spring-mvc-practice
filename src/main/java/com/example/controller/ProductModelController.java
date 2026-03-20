package com.example.controller;

import com.example.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductModelController {

    @GetMapping(value = "/form")
    public String get() {

        return "get";
    }

    @PostMapping(value = "/form")
    public String post(@ModelAttribute Product product, Model model) {

        model.addAttribute("productForm", product);
        return "productResult";
    }

}
