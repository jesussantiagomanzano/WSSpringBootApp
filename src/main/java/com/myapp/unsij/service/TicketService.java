package com.myapp.unsij.service;

import com.myapp.unsij.entity.Ticket;
import com.myapp.unsij.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    private final TicketRepository repository;

    @Autowired
    public TicketService(TicketRepository repository) {
        this.repository = repository;
    }

    public Ticket save(Ticket ticket){
        return repository.save(ticket);
    }

    public List<Ticket> findAll(){
        return repository.findAll();
    }


}
