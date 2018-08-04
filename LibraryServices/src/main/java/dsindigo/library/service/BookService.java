package dsindigo.library.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dsindigo.library.model.Book;
import dsindigo.library.model.BookModel;
import dsindigo.library.repository.IBookRepository;
import dsindigo.library.util.Convert;

@Service("bookService")
public class BookService implements IBookService {

	@Autowired
	private IBookRepository bookRepository;
	
	Convert convert = new Convert();
	
	@Override
	public List<Book> getAll() {
		
		List<BookModel> listBooksModel = this.bookRepository.findAll();
		
		List<Book> listBooks = this.convert.convertListBookModelToListBook(listBooksModel);
		
		return listBooks;
	}

	@Override
	public Book addBook(Book book) {
		
		Book bookResponse = null;
		
		BookModel bookModel = convert.convertBookToBookModel(book);
		bookResponse = convert.convertBookModelToBook(this.bookRepository.save(bookModel));
		
		return bookResponse;
	}

	@Override
	public Book findById(Long id) {
		
		Optional<BookModel> existing = this.bookRepository.findById(id);

	    Book book = this.convert.convertBookModelToBook(existing.get());
		
	 return book;
	}

	@Override
	public Book updateBook(Long id, Book book) {
		
		Book bookResponse = null;
		
		Optional<BookModel> existing = this.bookRepository.findById(id);
		
		if(existing.isPresent()) {
			book.setId(id);
			BookModel bookModel = this.convert.convertBookToBookModel(book);
			bookResponse = this.convert.convertBookModelToBook(this.bookRepository.save(bookModel));
		}
		
		return bookResponse;
	}

	@Override
	public void deleteBook(Long id) {
		
		Optional<BookModel> existing = this.bookRepository.findById(id);
		
		if(existing.isPresent()) {
			this.bookRepository.deleteById(id);
		}
	}

}
