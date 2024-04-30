package com.myapp.unsij.repository;

import com.myapp.unsij.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

    @Query(value = "SELECT id, age, last_name, name, email, curp FROM persona", nativeQuery = true)
    List<Persona> listaPersona();



}
