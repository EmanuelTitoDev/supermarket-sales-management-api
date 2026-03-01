package com.emanueltito.supermarket_sales_management_api.dto;

public record BranchResponseDTO(
        Long id,
        String name,
        String branchNumber,
        String street,
        String phoneNumber,
        String email,
        String cityName,
        String countryName,
        String companyName,
        String companyRuc
) {
}
