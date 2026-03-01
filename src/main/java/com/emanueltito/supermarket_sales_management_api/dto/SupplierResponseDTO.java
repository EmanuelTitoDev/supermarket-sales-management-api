package com.emanueltito.supermarket_sales_management_api.dto;

public record SupplierResponseDTO(
        Long id,
        String name,
        String ruc,
        String phoneNumber,
        String email
) {
}
