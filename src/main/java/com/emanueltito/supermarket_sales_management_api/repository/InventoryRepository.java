package com.emanueltito.supermarket_sales_management_api.repository;

import com.emanueltito.supermarket_sales_management_api.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}
