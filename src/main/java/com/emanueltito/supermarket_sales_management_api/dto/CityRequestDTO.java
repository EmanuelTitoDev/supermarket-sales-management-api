package com.emanueltito.supermarket_sales_management_api.dto;

public record CityRequestDTO(
        String name,
        Long countryId
) {
}
