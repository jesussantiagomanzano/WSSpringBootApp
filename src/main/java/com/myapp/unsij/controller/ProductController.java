package com.myapp.unsij.controller;

import com.myapp.unsij.entity.Product;
import com.myapp.unsij.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    private final ProductService service;

    @Autowired
    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public List<Product> saveProducts(@RequestBody List<Product> products){
        return service.saveProducts(products);
    }

    @GetMapping
    public List<Product> findAllProducts(){
        return service.findAllProducts();
    }


}
