package com.myapp.unsij.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

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

    @Pattern(regexp = "[A-Z]{4}+\\d{6}+[A-Z]{6}+\\d{2}", message = "Not valid CURP")
    private String curp;

    @NotNull(message = "Age must not be null")
    @Min(value = 0, message = "Min value must be 0")
    @Max(value = 200, message = "Value not allowed")
    private Integer age;


    @Email
    private String email;



}
