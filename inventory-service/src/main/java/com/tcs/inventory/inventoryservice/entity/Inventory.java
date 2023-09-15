package com.tcs.inventory.inventoryservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "inventories")
public class Inventory {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Long quantity;
}