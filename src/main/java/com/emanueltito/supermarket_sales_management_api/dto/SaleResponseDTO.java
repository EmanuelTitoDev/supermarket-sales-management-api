package com.emanueltito.supermarket_sales_management_api.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public record SaleResponseDTO(
        String branchName,
        String code,
        LocalDateTime date,
        String paymentType,
        BigDecimal totalAmount,
        List<SaleDetailResponseDTO> detailsSale
) {
}
