package com.emanueltito.supermarket_sales_management_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "SG_M_Empresa")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "Id_Empresa")
    private Long id;

    @Column(name = "Nombre", nullable = false, length = 100)
    private String name;

    @Column(name = "Ruc", nullable = false, unique = true, length = 13)
    private String ruc;

    @Column(name = "Telefono", nullable = false, length = 15)
    private String phoneNumber;

    @Column(name = "Correo", nullable = false, length = 100)
    private String email;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    private List<Branch> branches;
}
