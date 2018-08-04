package dsindigo.library.service;

import java.util.List;

import dsindigo.library.model.Book;

public interface IBookService {
	
	List<Book> getAll();
	
	Book addBook(Book book);
	
	Book updateBook(Long id, Book book);
	
	Book findById(Long id);
	
	void deleteBook(Long id);

}
