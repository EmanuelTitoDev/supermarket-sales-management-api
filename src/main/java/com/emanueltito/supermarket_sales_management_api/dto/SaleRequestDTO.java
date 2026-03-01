package com.emanueltito.supermarket_sales_management_api.dto;

import java.util.List;

public record SaleRequestDTO(
        Long branchId,
        Long paymentTypeId,
        List<SaleDetailRequestDTO> detailsSale
) {
}
