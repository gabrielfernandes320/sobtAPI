package com.sobt.controller;

import com.sobt.Customer;
import com.sobt.ServiceOrder;
import com.sobt.repository.CustomerRepository;
import com.sobt.repository.ServiceOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/v1")
public class ServiceOrdersController {

    @Autowired
    private ServiceOrderRepository serviceOrderRepository;

    @GetMapping("/serviceOrders")   // GET Method for reading operation
    public List<ServiceOrder> getAllServiceOrders() {
        return serviceOrderRepository.findAll();
    }
}
