package dsindigo.library.util;

import java.util.ArrayList;
import java.util.List;

import dsindigo.library.model.Book;
import dsindigo.library.model.BookModel;

public class Convert {

	public List<Book> convertListBookModelToListBook(List<BookModel> listBooksModel) {

		List<Book> listBook = new ArrayList<>();
		Book book = null;

		for (BookModel bookModel : listBooksModel) {
			book = new Book();
			book.setAuthor(bookModel.getAuthor());
			book.setEditorial(bookModel.getEditorial());
			book.setId(bookModel.getId());
			book.setName(bookModel.getName());
			book.setPages(bookModel.getPages());
			listBook.add(book);
		}

		return listBook;
	}

	public BookModel convertBookToBookModel(Book book) {

		BookModel bookModel = null;

		bookModel = new BookModel();
		bookModel.setId(book.getId());
		bookModel.setAuthor(book.getAuthor());
		bookModel.setEditorial(book.getEditorial());
		bookModel.setName(book.getName());
		bookModel.setPages(book.getPages());

		return bookModel;
	}
	
	public Book convertBookModelToBook(BookModel bookModel) {

		Book book = null;
		book = new Book();
		book.setAuthor(bookModel.getAuthor());
		book.setEditorial(bookModel.getEditorial());
		book.setId(bookModel.getId());
		book.setName(bookModel.getName());
		book.setPages(bookModel.getPages());

		return book;
	}

}
