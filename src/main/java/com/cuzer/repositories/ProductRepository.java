package com.cuzer.repositories;

import org.springframework.data.repository.CrudRepository;

import com.cuzer.domain.Product;

/**
 * Created by jt on 5/6/16.
 */
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
