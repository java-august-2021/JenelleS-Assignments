package com.JenelleHanson.updatedelete.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.JenelleHanson.updatedelete.models.Book;
import com.JenelleHanson.updatedelete.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepo;
	
	public BookService(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}
	
	 public List<Book> allBooks() {
	        return bookRepo.findAll();
	    }
	    // creates a book
	    public Book createBook(Book b) {
	        return bookRepo.save(b);
	    }
	    // retrieves a book
	    public Book findBook(Long id) {
	        Optional<Book> optionalBook = bookRepo.findById(id);
	        if(optionalBook.isPresent()) {
	            return optionalBook.get();
	        } else {
	            return null;
	        }
	    }
	    
	    public Book updateBook(Book b) {
	    	return bookRepo.save(b);
	    }
	    
	    public void deleteBook(Long id) {
	    	bookRepo.deleteById(id);
	    }
}
