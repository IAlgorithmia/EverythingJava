package com.mycompany.simplewebapp.controller;

import com.mycompany.simplewebapp.model.Product;
import com.mycompany.simplewebapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public String showProducts(){
        return service.getProducts().toString();
    }

    @GetMapping("/products/{prodId}")
    public Product showProduct(@PathVariable int prodId){
        return service.getProductById(prodId);
    }

    @PostMapping("/products")
    public void newProduct(@RequestBody Product product){
        service.addProduct(product);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product){
        service.updateProduct(product);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }

}
