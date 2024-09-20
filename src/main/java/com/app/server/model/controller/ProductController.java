package com.app.server.model.controller;

import com.app.server.repository.ProductRepository;
import org.hibernate.annotations.Array;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/products")
@CrossOrigin("*")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
}
