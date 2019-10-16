package com.sobt;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "order_status")
public class OrderStatus{
    @Id
    @GeneratedValue(generator = "orderStatus_generator")
    @SequenceGenerator(
            name = "orderStatus_generator",
            sequenceName = "orderStatus_sequence",
            initialValue = 1
    )
    private Long id;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy="orderStatus")
    private List<ServiceOrder> orders;

    public OrderStatus(List<ServiceOrder> orders) {
        this.orders = orders;
    }

    public OrderStatus() {
    }

    public OrderStatus(String descrption, List<ServiceOrder> orders) {
        this.description = descrption;
        this.orders = orders;
    }

    public List<ServiceOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<ServiceOrder> orders) {
        this.orders = orders;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescrption() {
        return description;
    }

    public void setDescrption(String descrption) {
        this.description = descrption;
    }
}
