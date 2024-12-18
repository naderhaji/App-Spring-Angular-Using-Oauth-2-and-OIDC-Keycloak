package com.hj.customer_app.web;

import org.springframework.stereotype.Controller;


@Controller
public class CustomerController {

    private CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

}
