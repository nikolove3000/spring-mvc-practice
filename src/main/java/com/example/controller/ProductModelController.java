package com.example.controller;

import com.example.model.Product;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProductModelController {

    @GetMapping(value = "/form")
    public String get(Model model) {

        model.addAttribute("product", new Product());
        return "get";
    }

    @GetMapping(value = "/productResult")
    public String productResult() {
        return "productResult";
    }

    @PostMapping(value = "/form")
    public String post(@Valid @ModelAttribute Product product,
                       BindingResult result, RedirectAttributes redirectAttributes) {

        if (result.hasErrors()){

            return "get";
        }

        redirectAttributes.addFlashAttribute("product", product);
        return "redirect:/productResult";
    }

}
