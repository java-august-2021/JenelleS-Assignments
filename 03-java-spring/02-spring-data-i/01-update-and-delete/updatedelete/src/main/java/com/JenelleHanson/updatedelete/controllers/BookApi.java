package com.JenelleHanson.updatedelete.controllers;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookApi {
//	@Autowired //creates dependency injection
//	private final BookService bService;
//	
//	public BookApi(BookService bService) {
//		this.bService = bService;
//	}
//
//	@RequestMapping("/api/books")
//	public List<Book> index(){
//		return bService.allBooks();
//	}
//	
//	@RequestMapping(value="/api/books", method=RequestMethod.POST)
//	public Book create(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
//		Book book = new Book(title, desc, lang, numOfPages);
//		return bService.createBook(book);
//	}
//	
//	
////	
////	@RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
////	public Book update(Book b) {
////		return bookService.createBook(b);
////	}
//	
//	
//	
//	@RequestMapping(value="/api/books/{id}", method=RequestMethod.POST)
//	public String update(@PathVariable("id") Long id, @RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
//		Book book = bService.findBook(id);
//		book.setTitle(title);
//		book.setDescription(desc);
//		book.setLanguage(lang);
//		book.setNumberOfPages(numOfPages);
//		//Save the book
//		return "redirect:/";//post methods should return a redirect in the controller 
//	}
//
////	@RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
////	public void destroy(@PathVariable("id") Long id) {
////		bService.deleteBook(id);
////	}
//	
//	@DeleteMapping("/api/books/{id}")
//	public String destroyBook(@PathVariable("id") Long id) {
//		this.bService.deleteBook(id);
//		return "redirect:/";
//	}

}
