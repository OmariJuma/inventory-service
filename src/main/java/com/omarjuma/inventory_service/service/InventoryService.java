package com.omarjuma.inventory_service.service;

import com.omarjuma.inventory_service.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class InventoryService {
    private final InventoryRepository inventoryRepository;

    public boolean isInStock(String sku, Integer quantity) {
        boolean isInStock = inventoryRepository.existsBySkuAndQuantityIsGreaterThanEqual(sku, quantity);
        log.info("{} is it present? -> {}", sku, isInStock);
        return isInStock;
    }

}
