package com.tcs.order.orderservice.controller;

import com.tcs.order.orderservice.entity.Order;
import com.tcs.order.orderservice.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService service;

    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrder(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<Order> saveOrder(@RequestBody Order order) {
        return ResponseEntity.ok(service.saveOrder(order));
    }
    // more CRUD methods

    @GetMapping("/customer/{customerId}")
    public ResponseEntity<Order> getCustomerOrder(@PathVariable Long customerId) {
        return ResponseEntity.ok(service.findByCustomerId(customerId));
    }
}
