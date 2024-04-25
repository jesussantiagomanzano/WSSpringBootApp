package com.myapp.unsij.entity;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "persona")
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(length = 300, name = "last_name", nullable = false)
    private String lastName;

    private String curp;

    private Integer age;

    @Column(nullable = false)
    private String email;



}
