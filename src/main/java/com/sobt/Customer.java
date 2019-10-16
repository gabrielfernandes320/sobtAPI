package com.sobt;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(generator = "customer_generator")
    @SequenceGenerator(
            name = "customer_generator",
            sequenceName = "customer_sequence",
            initialValue = 1
    )
    private Long id;

    private String name;

    private String adress;

    private String phone;

    private String email;

    @OneToMany(mappedBy="customer")
    private List<ServiceOrder> orders;

    public Customer() {
    }

    public Customer(String name, String adress, String phone, String email, List<ServiceOrder> orders) {
        this.name = name;
        this.adress = adress;
        this.phone = phone;
        this.email = email;
        this.orders = orders;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<ServiceOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<ServiceOrder> orders) {
        this.orders = orders;
    }
}
