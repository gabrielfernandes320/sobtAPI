package com.sobt.controller;

import java.util.List;

import com.sobt.Customer;
import com.sobt.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class CustomersController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customers")   // GET Method for reading operation
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @GetMapping("/customers/{id}")
    public Customer FindCustomer(@PathVariable(value="id") long id){
        return customerRepository.findById(id);
    }

    @PostMapping("/customers")
    public Customer SaveCustomer(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }

    @DeleteMapping("/customers/{id}")
    public void deleteCustomer (@PathVariable Long id){
        customerRepository.deleteById(id);
    }

    @PutMapping("/customers/{id}")
    public Customer updateCustomer(@PathVariable Integer id, @RequestBody Customer customer){
        return customerRepository.save(customer);

    }

}
