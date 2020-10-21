package com.bookapp.client;

import java.util.List;

import com.bookapp.model.Book;
import com.bookapp.service.BookService;
import com.bookapp.service.BookServiceImpl;

public class User {

	public static void main(String[] args) {
		BookService bookService = new BookServiceImpl();
		List<Book> bookList = bookService.getAllBooks();
		Integer id = 2;
		System.out.println(bookService.getById(id));
		
		for(Book book : bookList) {
			System.out.println(book);
		}
		
	}

}
