package com.myapp.unsij.controller;

import com.myapp.unsij.entity.Product;
import com.myapp.unsij.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("product")
public class ProductController {

    private final ProductService service;

    @Autowired
    public ProductController(ProductService service) {
        this.service = service;
    }

    @PostMapping("saveProductList")
    @ResponseStatus(HttpStatus.CREATED)
    public List<Product> saveProducts(@RequestBody List<Product> products){
        return service.saveProducts(products);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product saveProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }


    @GetMapping
    public List<Product> findAllProducts(){
        return service.findAllProducts();
    }


    @GetMapping("/findProductById/{idProduct}")
    public Product findProductById(@PathVariable Long idProduct){
        return service.findProductById(idProduct);
    }

    @DeleteMapping("/{idProduct}")
    public void deleteProductById(@PathVariable Long idProduct){
        service.deleteProductById(idProduct);
    }



}
