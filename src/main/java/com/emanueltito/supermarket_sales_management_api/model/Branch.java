package com.emanueltito.supermarket_sales_management_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "SG_M_Sucursal")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "Id_Sucursal")
    private Long id;

    @Column(name = "Nombre", nullable = false, length = 100)
    private String name;

    @Column(name = "Num_Sucursal", nullable = false, unique = true, length = 15)
    private String branchNumber;

    @Column(name = "Calle", nullable = false, length = 150)
    private String street;

    @Column(name = "Num_Telefono", nullable = false, length = 15)
    private String phoneNumber;

    @Column(name = "Correo", nullable = false, length = 100)
    private String email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id_Empresa", nullable = false)
    private Company company;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id_Ciudad", nullable = false)
    private City city;

    @OneToMany(mappedBy = "branch")
    private List<Sale> sales;

    @OneToMany(mappedBy = "branch")
    private List<Inventory> inventories;


}
