package com.cuzer.repositories;

import org.springframework.data.repository.CrudRepository;

import com.cuzer.domain.ProductCategory;

/**
 * Created by jt on 5/6/16.
 */
public interface ProductCategoryRepository extends CrudRepository<ProductCategory, Integer> {
}
