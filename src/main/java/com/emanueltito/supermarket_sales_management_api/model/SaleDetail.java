package com.emanueltito.supermarket_sales_management_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "SG_T_Detalle_Venta")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SaleDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "Id_Detalle_Venta")
    private Long id;

    @Column(name = "Precio_Unitario", nullable = false, precision = 7, scale = 2)
    private BigDecimal unitPrice;

    @Column(name = "Cantidad", nullable = false)
    private Integer quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id_Venta", nullable = false)
    private Sale sale;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id_Producto", nullable = false)
    private Product product;
}
