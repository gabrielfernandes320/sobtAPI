package com.sobt.repository;

import com.sobt.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderStatusRepository extends JpaRepository<OrderStatus,Long> {

    OrderStatus findById(long id);

}
