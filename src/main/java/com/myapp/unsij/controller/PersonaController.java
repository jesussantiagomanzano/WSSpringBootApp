package com.myapp.unsij.controller;

import com.myapp.unsij.entity.Persona;
import com.myapp.unsij.service.PersonaService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "persona")
public class PersonaController {

    private final PersonaService service;

    public PersonaController(PersonaService service) {
        this.service = service;
    }

    @PostMapping
    public Persona addPersona(@RequestBody Persona persona){
       return service.savePersona(persona);
    }

    @GetMapping
    public List<Persona> getAll(){
        return service.getAllPersona();
    }




}
