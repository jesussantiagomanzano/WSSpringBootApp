package com.myapp.unsij.controller;

import com.myapp.unsij.entity.Product;
import com.myapp.unsij.entity.Ticket;
import com.myapp.unsij.service.ProductService;
import com.myapp.unsij.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ticket")
public class TicketController {

    private final TicketService service;

    @Autowired
    public TicketController(TicketService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Ticket saveTicket(@RequestBody Ticket ticket){
        return service.save(ticket);
    }

    @GetMapping
    public List<Ticket> findAllProducts(){
        return service.findAll();
    }


}
