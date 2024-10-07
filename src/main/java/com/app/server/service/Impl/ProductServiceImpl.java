package com.app.server.service.Impl;

import com.app.server.model.entity.Product;
import com.app.server.repository.ProductRepository;
import com.app.server.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllEntities() {
        return productRepository.findAll();
    }

    @Override
    public Product getEntityById(int id) {
        return productRepository.findById(id).get();
    }

    @Override
    public void deleteEntity(int id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product saveEntity(Product entity) {
        return productRepository.save(entity);
    }

    @Override
    public Product createEntity(Product entity) {
        return saveEntity(entity);
    }
}
