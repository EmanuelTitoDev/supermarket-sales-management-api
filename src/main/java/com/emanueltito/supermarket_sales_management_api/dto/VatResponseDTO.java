package com.emanueltito.supermarket_sales_management_api.dto;

import java.math.BigDecimal;

public record VatResponseDTO(
        Long id,
        BigDecimal percentage
) {
}
