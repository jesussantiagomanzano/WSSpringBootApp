package com.myapp.unsij.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table
@AllArgsConstructor //Constructor con todos los parametros
@NoArgsConstructor //Constructor sin parametros
@Setter
@Getter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    @Column(name = "description")
    private String description;
    private Double weight;

    @ManyToOne
    @JoinColumn(name = "ticket_id")
    @JsonBackReference
    private Ticket ticket;

}
