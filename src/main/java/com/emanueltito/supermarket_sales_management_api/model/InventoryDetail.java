package com.emanueltito.supermarket_sales_management_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "SG_T_Detalle_Inventario")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InventoryDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "Id_Detalle_Inventario")
    private Long id;

    @Column(name = "Precio_Unitario", nullable = false)
    private Integer unitPrice;

    @Column(name = "Cantidad", nullable = false)
    private Integer quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id_Inventario", nullable = false)
    private Inventory inventory;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id_Producto", nullable = false)
    private Product product;

}
