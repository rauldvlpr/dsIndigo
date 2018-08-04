package dsindigo.library.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;

import dsindigo.library.model.Book;
import dsindigo.library.service.IBookService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/books")
public class BookController {
	
	@Autowired
	private IBookService bookService;
	
	public BookController() {
		super();
	}
	
	@GetMapping
	public List<Book> getAllBooks() {
		List<Book> listBooks = new ArrayList<>();
		System.out.println("en getAllBooks*******************************");
		listBooks = this.bookService.getAll();
		
		return listBooks;
	}
	
	 @GetMapping("/{id}")
	 public Book getById(@PathVariable Long id) {
		 
		 System.out.println("en getById*******************************");
		 return this.bookService.findById(id);
	 }
	
	@PostMapping("/addBook")
	public Book addBook(@RequestBody Book book) {
		System.out.println("en addBook*******************************");
		Book bookResponse = this.bookService.addBook(book);
		
		return bookResponse;
	}
	
	
	@PutMapping("/updateBook/{id}")
	public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
		System.out.println("en updateBook*******************************");	
	   Book bookResponse = this.bookService.updateBook(id, book);
		
		return bookResponse;
	}
	
	
	@DeleteMapping("/deleteBook/{id}")
	public void deleteBook(@PathVariable Long id) {
		System.out.println("en deleteBook*******************************");
		this.bookService.deleteBook(id);
		
	}

}
