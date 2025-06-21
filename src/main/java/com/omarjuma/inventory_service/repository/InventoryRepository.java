package com.omarjuma.inventory_service.repository;

import com.omarjuma.inventory_service.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    boolean existsBySkuAndQuantityIsGreaterThanEqual(String skuCode, Integer quantity);
}
