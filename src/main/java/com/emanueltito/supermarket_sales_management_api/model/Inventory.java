package com.emanueltito.supermarket_sales_management_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "SG_T_Inventario")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "Id_Inventario")
    private Long id;

    @Column(name = "Codigo", nullable = false, unique = true, length = 20)
    private String code;

    @Column(name = "Fecha_Hora", nullable = false)
    private LocalDateTime date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id_Sucursal", nullable = false)
    private Branch branch;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id_Movimiento")
    private MovementType movementType;

    @OneToMany(mappedBy = "inventory", cascade = CascadeType.ALL)
    private List<InventoryDetail> inventoryDetails;
}
