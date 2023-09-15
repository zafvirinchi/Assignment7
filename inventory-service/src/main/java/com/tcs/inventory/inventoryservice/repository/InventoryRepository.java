package com.tcs.inventory.inventoryservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.inventory.inventoryservice.entity.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {}
