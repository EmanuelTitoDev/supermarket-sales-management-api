package com.emanueltito.supermarket_sales_management_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "SG_M_Producto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "Id_Producto")
    private Long id;

    @Column(name = "Codigo", nullable = false, unique = true, length = 20)
    private String code;

    @Column(name = "Nombre", nullable = false, length = 150)
    private String name;

    @Column(name = "Precio", nullable = false, precision = 7, scale = 2)
    private BigDecimal price;

    @OneToMany(mappedBy = "product")
    private List<InventoryDetail> inventoryDetails;

    @OneToMany(mappedBy = "product")
    private List<SaleDetail> saleDetails;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id_Categoria", nullable = false)
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id_Iva", nullable = false)
    private Vat vat;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id_Proveedor", nullable = false)
    private Supplier supplier;
}
