package com.tcs.inventory.inventoryservice.messaging;

import com.tcs.inventory.inventoryservice.entity.Inventory;
import com.tcs.inventory.inventoryservice.model.Order;
import com.tcs.inventory.inventoryservice.repository.InventoryRepository;



import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class InventoryEventConsumer {
	
	
    @Autowired
    InventoryRepository repository;

    @KafkaListener(topics = "OrderPlaced", groupId = "myGroup")
    public void updateInventory(Order order) {
        Inventory inventory = repository.findById(order.getProductId()).orElse(null);
        if (inventory != null) {
            inventory.setQuantity(inventory.getQuantity() - order.getQuantity());
            repository.save(inventory);
        }
        
    }
}
