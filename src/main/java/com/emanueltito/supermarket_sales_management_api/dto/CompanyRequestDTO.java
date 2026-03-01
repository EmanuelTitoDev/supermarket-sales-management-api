package com.emanueltito.supermarket_sales_management_api.dto;

public record CompanyRequestDTO(
        String name,
        String ruc,
        String phoneNumber,
        String email
) {
}
