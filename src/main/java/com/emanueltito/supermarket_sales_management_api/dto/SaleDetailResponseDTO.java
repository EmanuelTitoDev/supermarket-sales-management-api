package com.emanueltito.supermarket_sales_management_api.dto;

import java.math.BigDecimal;

public record SaleDetailResponseDTO(
        Integer quantity,
        String productName,
        BigDecimal unitPrice,
        BigDecimal subTotal

) {
}
