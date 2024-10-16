package com.app.server.service.Impl;

import com.app.server.model.entity.Product;
import com.app.server.repository.ProductRepository;
import com.app.server.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl extends BasicServiceImpl<Product> implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        super(productRepository);
        this.productRepository = productRepository;
    }

}
