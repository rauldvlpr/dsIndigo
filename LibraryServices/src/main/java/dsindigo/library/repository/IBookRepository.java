package dsindigo.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dsindigo.library.model.BookModel;

@Repository("bookRepository")
public interface IBookRepository extends JpaRepository<BookModel, Long> {
	
	

}
