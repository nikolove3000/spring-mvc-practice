package com.example.controller;

import com.example.model.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/**
 * Controller handling a multi-step order process using session attributes.
 * Steps:
 * 1. /order/step1 → initialize order and get user input
 * 2. /order/step2 → review/update order
 * 3. /order/complete → finalize order and clear session
 */
@Controller
@SessionAttributes("order")
public class OrderController {

    /**
     * Handles GET request for step 1 of the order process.
     * Initializes a new empty Order and stores it in the session.
     * @param model the Model used to pass data to the view
     * @return the view name for step 1 form
     */
    @GetMapping("/order/step1")
    public String step1(Model model) {

        model.addAttribute("order", new Order());
        return "order-step1";
    }

    /**
     * Handles POST request for step 1 of the order process.
     * Receives user input from step 1 form and updates the Order in session.
     * @param order the Order object bound from the form input
     * @return redirect to step 2 of the order process
     */
    @PostMapping("/order/step1")
    public String step1Submit(@ModelAttribute("order") Order order) {

        return "redirect:/order/step2";
    }

    /**
     * Handles GET request for step 2 of the order process.
     * Retrieves the Order from session and prepares it for display in the view.
     * @param order the Order object retrieved from session
     * @param model the Model used to pass data to the view
     * @return the view name for step 2 form
     */
    @GetMapping("/order/step2")
    public String step2(@ModelAttribute("order") Order order, Model model) {

        model.addAttribute("order", order);
        return "order-step2";
    }

    /**
     * Handles GET request for confirm page in order
     * @return the view confirm message page
     */
    @GetMapping("/order/confirm")
    public String confirm() {
        return "order-confirm";
    }

    /**
     * Handles POST request to complete the order process.
     * Finalizes the order and clears the session attribute.
     * @param order  the Order object retrieved from session
     * @param status the SessionStatus used to mark session completion
     * @return redirect to confirmation page
     */
    @PostMapping("/order/complete")
    public String complete(@ModelAttribute("order") Order order,
                           SessionStatus status) {

        status.setComplete();
        return "redirect:/order/confirm";
    }
}
