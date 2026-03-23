package com.example.advice;

import com.example.exception.ProductNotFoundException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Handles ProductNotFoundException and returns error view.
     * @param exception the thrown ProductNotFoundException
     * @param model model used to pass data to the view
     * @return error page name
     */
    @ExceptionHandler(ProductNotFoundException.class)
    public String handleProductNotFound(ProductNotFoundException exception,
                                        Model model) {


        model.addAttribute("errorMessage", exception.getMessage());
        return "error";
    }
}
