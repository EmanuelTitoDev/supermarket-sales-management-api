package com.emanueltito.supermarket_sales_management_api.repository;

import com.emanueltito.supermarket_sales_management_api.model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<Branch, Long> {
}
