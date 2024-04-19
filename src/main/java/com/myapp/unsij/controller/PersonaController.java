package com.myapp.unsij.controller;

import com.myapp.unsij.entity.Persona;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {

    @GetMapping("/persona")
    public Persona personas(){

        return new Persona("Jesus", "Santiago", "SAMJ");
    }


}
