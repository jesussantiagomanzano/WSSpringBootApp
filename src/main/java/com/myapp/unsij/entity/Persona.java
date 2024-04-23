package com.myapp.unsij.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class Persona {

    @Id
    private Long id;
    private String name;
    private String lastName;
    private String curp;
    private Integer age;
    private String email;



}
