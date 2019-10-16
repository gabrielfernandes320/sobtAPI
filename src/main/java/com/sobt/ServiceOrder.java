package com.sobt;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "service_order")
public class ServiceOrder{
    @Id
    @GeneratedValue(generator = "so_generator")
    @SequenceGenerator(
            name = "so_generator",
            sequenceName = "so_sequence",
            initialValue = 1
    )
    private Long id;

    @ManyToOne
    @JoinColumn(name="fk_customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name="fk_order_status")
    private OrderStatus orderStatus;

    @Column(name = "item_problem")
    private String itemProblem;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "item_type")
    private String itemType;

    @Column(name = "order_date")
    private String orderDate;

    public ServiceOrder() {}

    public ServiceOrder(Customer customer, OrderStatus orderStatus, String itemProblem, String itemName, String itemType, String orderDate) {
        this.customer = customer;
        this.orderStatus = orderStatus;
        this.itemProblem = itemProblem;
        this.itemName = itemName;
        this.itemType = itemType;
        this.orderDate = orderDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /*public Customer getCustomer() {
        return customer;
    }*/

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /*public OrderStatus getOrderStatus() {
        return orderStatus;
    }*/

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getItemProblem() {
        return itemProblem;
    }

    public void setItemProblem(String itemProblem) {
        this.itemProblem = itemProblem;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
}
