package com.cuzer.repositories;

import org.springframework.data.repository.CrudRepository;

import com.cuzer.domain.Author;

/**
 * Created by jt on 5/6/16.
 */
public interface AuthorRepository extends CrudRepository<Author, Integer> {
}
