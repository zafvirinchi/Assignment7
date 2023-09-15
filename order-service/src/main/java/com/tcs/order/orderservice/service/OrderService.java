package com.tcs.order.orderservice.service;

import com.tcs.order.orderservice.entity.Order;
import com.tcs.order.orderservice.repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private KafkaTemplate<String, Order> kafkaTemplate;

    public Order findById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public Order saveOrder(Order order){
        Order savedOrder = orderRepository.save(order);
        kafkaTemplate.send("OrderPlaced", savedOrder);
        return savedOrder;
    }

    public Order findByCustomerId(Long customerId) {
        return orderRepository.findByCustomerId(customerId);
    }
}
