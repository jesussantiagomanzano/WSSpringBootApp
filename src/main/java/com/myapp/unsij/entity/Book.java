package com.myapp.unsij.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    private Long id;
    private String title;
    private String isbn;
    private int year;




}
