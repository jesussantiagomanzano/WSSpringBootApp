package com.myapp.unsij.controller;

import com.myapp.unsij.entity.Persona;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "personas")
public class PersonaController {

    List<Persona> personas  = new ArrayList<>();

    @GetMapping()
    public List<Persona> personas(){

        return personas;
    }

    @PostMapping
    public Persona addPersona(@RequestBody Persona persona){
        personas.add(persona);
       return persona;
    }




}
