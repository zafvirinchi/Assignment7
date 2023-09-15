package com.tcs.inventory.inventoryservice.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;


@Data
public class Order implements Serializable {
    private Long id;
    private Long productId;
    private Long customerId;
    private Long quantity;
}