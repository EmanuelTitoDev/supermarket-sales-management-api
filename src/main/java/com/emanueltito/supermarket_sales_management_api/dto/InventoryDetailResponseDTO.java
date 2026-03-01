package com.emanueltito.supermarket_sales_management_api.dto;

import java.math.BigDecimal;

public record InventoryDetailResponseDTO(
        Long inventoryId,
        String productCode,
        String productName,
        Integer quantity,
        BigDecimal unitPrice

) {
}
