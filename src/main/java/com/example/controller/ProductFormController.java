package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductFormController {

    @GetMapping(value = "/add")
    public String add(){

        return "add";
    }


    @PostMapping(value = "/add")
    public String post(@RequestParam(value = "productName") String productName, Model model) {

        model.addAttribute("productName", productName);

        return "result";
    }

}
