package com.emanueltito.supermarket_sales_management_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "SG_P_Iva")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vat {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "Id_Iva")
    private Long id;

    @Column(name = "Porcentaje", nullable = false, unique = true, precision = 3, scale = 2)
    private BigDecimal percentage;

    @OneToMany(mappedBy = "vat")
    private List<Product> products;
}
