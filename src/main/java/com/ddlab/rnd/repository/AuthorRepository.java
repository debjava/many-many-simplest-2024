package com.ddlab.rnd.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ddlab.rnd.entity.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
	List<Author> findAll();
}