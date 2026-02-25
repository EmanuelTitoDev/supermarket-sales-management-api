package com.emanueltito.supermarket_sales_management_api.repository;

import com.emanueltito.supermarket_sales_management_api.model.MovementType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovementTypeRepository extends JpaRepository<MovementType, Long> {
}
