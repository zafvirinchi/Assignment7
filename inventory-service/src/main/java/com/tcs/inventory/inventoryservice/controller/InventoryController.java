package com.tcs.inventory.inventoryservice.controller;

import com.tcs.inventory.inventoryservice.entity.Inventory;
import com.tcs.inventory.inventoryservice.service.InventoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventories")
public class InventoryController {
    @Autowired
    private InventoryService service;

    @GetMapping("/{id}")
    public ResponseEntity<Inventory> getProduct(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<Inventory> saveProduct(@RequestBody Inventory inventory) {
        return ResponseEntity.ok(service.saveProduct(inventory));
    }
}
