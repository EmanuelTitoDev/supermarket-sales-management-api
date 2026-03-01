package com.emanueltito.supermarket_sales_management_api.dto;

public record BranchRequestDTO(
        String name,
        String branchNumber,
        String street,
        String phoneNumber,
        String email,
        Long companyId,
        Long cityId

) {
}
