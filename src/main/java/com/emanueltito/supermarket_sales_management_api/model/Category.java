package com.emanueltito.supermarket_sales_management_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "SG_P_Categoria")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "Id_Categoria")
    private Long id;
    @Column(name = "Nombre", nullable = false, unique = true, length = 100)
    private String name;
    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
