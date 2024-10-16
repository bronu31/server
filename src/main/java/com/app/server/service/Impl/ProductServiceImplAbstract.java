package com.app.server.service.Impl;

import com.app.server.model.entity.Product;
import com.app.server.repository.ProductRepository;
import com.app.server.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImplAbstract extends AbstractBasicServiceImpl<Product> implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImplAbstract(ProductRepository productRepository) {
        super(productRepository);
        this.productRepository = productRepository;
    }

}
