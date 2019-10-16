package com.sobt;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.List;

@Entity
@Table(name = "order_status")
public class OrderStatus extends AuditModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "description")
    private String description;


    @OneToMany(mappedBy="orderStatus")
    private List<ServiceOrder> orders;


    public OrderStatus(List<ServiceOrder> orders) {
        this.orders = orders;
    }

    public OrderStatus() {
    }

    public OrderStatus(String description, List<ServiceOrder> orders) {
        this.description = description;
        this.orders = orders;
    }

    public List<ServiceOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<ServiceOrder> orders) {
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String description() {
        return description;
    }

    public void description(String description) {
        this.description = description;
    }
}
