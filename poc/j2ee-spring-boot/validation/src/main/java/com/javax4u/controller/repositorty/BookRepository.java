package com.javax4u.controller.repositorty;

import java.awt.print.Book;
import java.util.List;

public interface BookRepository {

	List<Book> findAll();

	Book save(Book newBook);

	Book findById(Long bookId);

}
