package com.emanueltito.supermarket_sales_management_api.repository;

import com.emanueltito.supermarket_sales_management_api.model.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentTypeRepository extends JpaRepository<PaymentType, Long> {
}
