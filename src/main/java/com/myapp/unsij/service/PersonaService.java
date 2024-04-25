package com.myapp.unsij.service;

import com.myapp.unsij.entity.Persona;
import com.myapp.unsij.repository.PersonaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    private final PersonaRepository repository;

    public PersonaService(PersonaRepository repository) {
        this.repository = repository;
    }

    public Persona savePersona(Persona persona){
          return repository.save(persona);
    }

    public List<Persona> getAllPersona(){
        return repository.listaPersona();
    }

}
