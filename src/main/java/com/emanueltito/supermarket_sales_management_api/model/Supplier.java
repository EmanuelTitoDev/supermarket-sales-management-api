package com.emanueltito.supermarket_sales_management_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "SG_M_Proveedor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "Id_Proveedor")
    private Long id;

    @Column(name = "Ruc", nullable = false, unique = true, length = 13)
    private String ruc;

    @Column(name = "Nombre", nullable = false, unique = true, length = 150)
    private String name;

    @Column(name = "Telefono", nullable = false, unique = true, length = 15)
    private String phoneNumber;

    @Column(name = "Correo", nullable = false, unique = true, length = 150)
    private String email;
    
    @OneToMany(mappedBy = "supplier")
    private List<Product> products;
}
