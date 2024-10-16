package com.app.server.repository;


import com.app.server.model.entity.Product;

import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends BasicRepository<Product> {
}
