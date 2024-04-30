package com.myapp.unsij.entity;

import jakarta.persistence.*;
import lombok.*;

@Table
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

}
