package com.emanueltito.supermarket_sales_management_api.dto;

import java.math.BigDecimal;

public record ProductRequestDTO(
        String code,
        String name,
        BigDecimal price,
        Long categoryId,
        Long vatId,
        Long supplierId
) {
}
