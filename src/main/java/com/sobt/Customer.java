package com.sobt;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "customer")
public class Customer extends AuditModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String adress;

    private String phone;

    private String email;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY , mappedBy = "customer")
    private Set<ServiceOrder> orders;

    public Customer() {
    }

    public Customer(String name, String adress, String phone, String email) {
        this.name = name;
        this.adress = adress;
        this.phone = phone;
        this.email = email;
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

    public Set<ServiceOrder> getOrders() {
        return orders;
    }

    public void setOrders(Set<ServiceOrder> orders) {
        this.orders = orders;
    }
}
