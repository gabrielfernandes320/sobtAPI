package com.sobt.controller;

import java.util.List;

import com.sobt.ServiceOrder;
import com.sobt.repository.ServiceOrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
