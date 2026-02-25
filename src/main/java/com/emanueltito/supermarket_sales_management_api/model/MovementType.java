package com.emanueltito.supermarket_sales_management_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "SG_P_Movimiento")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovementType {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "Id_Movimiento")
    private Long id;

    @Column(name = "Descripcion", nullable = false, length = 50)
    private String description;

    @OneToMany(mappedBy = "movementType")
    private List<Inventory> inventories;
}
