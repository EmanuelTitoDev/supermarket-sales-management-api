package com.emanueltito.supermarket_sales_management_api.dto;

import java.time.LocalDateTime;
import java.util.List;

public record InventoryResponseDTO(
        String code,
        String branchName,
        LocalDateTime date,
        String movementTypeName,
        List<InventoryDetailResponseDTO> detailsInventory
) {
}
