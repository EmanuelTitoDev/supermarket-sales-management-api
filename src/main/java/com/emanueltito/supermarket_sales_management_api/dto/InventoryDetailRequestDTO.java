package com.emanueltito.supermarket_sales_management_api.dto;

import java.math.BigDecimal;

public record InventoryDetailRequestDTO(
        Long productId,
        BigDecimal unitCost,
        Integer quantity
) {
}
