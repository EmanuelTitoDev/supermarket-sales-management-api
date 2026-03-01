package com.emanueltito.supermarket_sales_management_api.dto;

import java.util.List;

public record InventoryRequestDTO(
        Long branchId,
        Long movementTypeId,
        List<InventoryDetailRequestDTO> detailsInventory
) {
}
