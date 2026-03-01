package com.emanueltito.supermarket_sales_management_api.dto;

public record SaleDetailRequestDTO(
        String productCode,
        Integer quantity
) {
}
