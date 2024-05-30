package com.myapp.unsij.service;

import com.myapp.unsij.entity.Product;
import com.myapp.unsij.repository.ProductRepository;
import com.myapp.unsij.utils.UnsijAppException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> saveProducts(List<Product> products) {
        return productRepository.saveAll(products);
    }

    public List<Product> findAllProducts(){
        return productRepository.findAll();
    }


    public Product findProductById(Long idProduct) {
        Optional<Product> productOptional = productRepository.findById(idProduct);
        if(productOptional.isPresent()){
          return  productOptional.get();
        }
        else{
            throw new UnsijAppException("Producto no encontrado");
        }
    }

    public void deleteProductById(Long idProduct) {
        productRepository.deleteById(idProduct);
    }
}
