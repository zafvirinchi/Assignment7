package com.tcs.inventory.inventoryservice.service;

import com.tcs.inventory.inventoryservice.entity.Inventory;
import com.tcs.inventory.inventoryservice.repository.InventoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {
    @Autowired
    private InventoryRepository inventoryRepository;

    public Inventory findById(Long id) {
        return inventoryRepository.findById(id).orElse(null);
    }

    public Inventory saveProduct(Inventory inventory){
        return inventoryRepository.save(inventory);
    }
}
