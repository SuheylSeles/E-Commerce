package com.suheyl.shoppingapp.product.repository;

import com.suheyl.shoppingapp.product.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
