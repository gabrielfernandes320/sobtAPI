package com.sobt.controller;

import java.util.List;

import com.sobt.ServiceOrder;
import com.sobt.repository.ServiceOrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class ServiceOrdersController {

    @Autowired
    private ServiceOrderRepository serviceOrderRepository;


    @GetMapping("/serviceOrders")   // GET Method for reading operation
    public List<ServiceOrder> getAllServiceOrders() {
        return serviceOrderRepository.findAll();
    }

    @GetMapping("/serviceOrders/{id}")
    public ServiceOrder FindServiceOrder(@PathVariable(value="id") long id){
        return serviceOrderRepository.findById(id);
    }

    @PostMapping("/serviceOrders")
    public ServiceOrder SaveServiceOrder(@RequestBody ServiceOrder serviceOrder){
        return serviceOrderRepository.save(serviceOrder);
    }

    @DeleteMapping("/serviceOrders/{id}")
    public void deleteServiceOrder (@PathVariable Long id){
        serviceOrderRepository.deleteById(id);
    }

    @PutMapping("/serviceOrders/{id}")
    public ServiceOrder updateServiceOrder(@PathVariable Integer id, @RequestBody ServiceOrder serviceOrder){
        return serviceOrderRepository.save(serviceOrder);

    }
}
