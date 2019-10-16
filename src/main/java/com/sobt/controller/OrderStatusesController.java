package com.sobt.controller;

import java.util.List;

import com.sobt.OrderStatus;
import com.sobt.repository.OrderStatusRepository;

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
public class OrderStatusesController {

    @Autowired
    private OrderStatusRepository orderStatusRepository;

    @GetMapping("/orderStatus")   // GET Method for reading operation
    public List<OrderStatus> getAllOrderStatuses() {
        return orderStatusRepository.findAll();
    }

    @GetMapping("/orderStatus/{id}")
    public OrderStatus FindOrderStatus(@PathVariable(value="id") long id){
        return orderStatusRepository.findById(id);
    }

    @PostMapping("/orderStatus")
    public OrderStatus SaveOrderStatus(@RequestBody OrderStatus orderStatus){
        return orderStatusRepository.save(orderStatus);
    }

    @DeleteMapping("/orderStatus/{id}")
    public void deleteOrderStatus (@PathVariable Long id){
        orderStatusRepository.deleteById(id);
    }

    @PutMapping("/orderStatus/{id}")
    public OrderStatus updateOrderStatus(@PathVariable Integer id, @RequestBody OrderStatus orderStatus){
        return orderStatusRepository.save(orderStatus);

    }

}
