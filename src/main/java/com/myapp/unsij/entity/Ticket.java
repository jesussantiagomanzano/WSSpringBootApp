package com.myapp.unsij.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
//boilerplate code

@Entity
@Table
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
    @Id

    
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private Double total;

    @Temporal(TemporalType.DATE)
    private Date date;

    @OneToMany(mappedBy = "ticket", cascade=CascadeType.REMOVE)
    @JsonManagedReference
    private List<Product> products;


}
