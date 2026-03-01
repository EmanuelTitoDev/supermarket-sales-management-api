package com.emanueltito.supermarket_sales_management_api.dto;

public record SupplierRequestDTO(
        String ruc,
        String name,
        String phoneNumber,
        String email
) {
}
