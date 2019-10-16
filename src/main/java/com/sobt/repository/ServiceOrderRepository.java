package com.sobt.repository;
import com.sobt.Customer;
import com.sobt.ServiceOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceOrderRepository extends JpaRepository<ServiceOrder,Long>{

}
