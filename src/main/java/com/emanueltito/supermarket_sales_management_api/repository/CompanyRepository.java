package com.emanueltito.supermarket_sales_management_api.repository;

import com.emanueltito.supermarket_sales_management_api.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
