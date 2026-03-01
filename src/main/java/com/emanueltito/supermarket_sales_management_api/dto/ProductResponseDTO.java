package com.emanueltito.supermarket_sales_management_api.dto;

import java.math.BigDecimal;

public record ProductResponseDTO(
        Long id,
        String code,
        String name,
        BigDecimal price,
        String categoryName,
        BigDecimal vatPercentage,
        String supplierName
) {
}
