package com.JenelleHanson.updatedelete.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.JenelleHanson.updatedelete.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {//Long is because of the Id in the model
	List<Book> findAll();
	List<Book> findByDescriptionContaining(String search);
    // this method counts how many titles contain a certain string
    Long countByTitleContaining(String search);
    // this method deletes a book that starts with a specific title
    Long deleteByTitleStartingWith(String search);
}
