package com.sobt.controller;

import com.sobt.Customer;
import com.sobt.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customers")   // GET Method for reading operation
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

}
