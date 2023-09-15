package com.tcs.order.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.order.orderservice.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    Order findByCustomerId(Long customerId);
}
