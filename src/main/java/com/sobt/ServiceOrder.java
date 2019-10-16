package com.sobt;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "service_order")
public class ServiceOrder extends AuditModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @ManyToOne
    @JoinColumn(name="fk_customer_id")
    private Customer customer;


    @ManyToOne
    @JoinColumn(name="fk_order_status")
    private OrderStatus orderStatus;


    @ManyToOne
    @JoinColumn(name="fk_item_type")
    private ItemType itemType;

    @Column(name = "item_problem")
    private String itemProblem;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "order_date")
    private Date orderDate;

    public ServiceOrder() {
    }

    public ServiceOrder(Customer customer, OrderStatus orderStatus, ItemType itemType, String itemProblem, String itemName, Date orderDate) {
        this.customer = customer;
        this.orderStatus = orderStatus;
        this.itemType = itemType;
        this.itemProblem = itemProblem;
        this.itemName = itemName;
        this.orderDate = orderDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
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

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
