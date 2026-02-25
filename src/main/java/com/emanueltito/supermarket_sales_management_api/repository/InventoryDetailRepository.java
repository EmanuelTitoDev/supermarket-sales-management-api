package com.emanueltito.supermarket_sales_management_api.repository;

import com.emanueltito.supermarket_sales_management_api.model.InventoryDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryDetailRepository extends JpaRepository<InventoryDetail, Long> {
}
