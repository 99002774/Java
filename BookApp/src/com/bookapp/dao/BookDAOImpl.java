package com.bookapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;

public class BookDAOImpl implements BookDAO {

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return showBookList();
	}

	@Override
	public List<Book> getByAuthor(String author) {
		List<Book> newBookList = new ArrayList<>();
		for (Book book : showBookList()) {
			if(book.getAuthor().equals(author))
				newBookList.add(book);
		}
		
		return newBookList;
				
	}

	@Override
	public List<Book> getByCategory(String category) {
		// TODO Auto-generated method stub
		List<Book> newBookList = new ArrayList<>();
		for (Book book : showBookList()) {
			if(book.getCategory().equals(category))
				newBookList.add(book);
		}
		
		return newBookList;
				
		
	}

	@Override
	public Book getById(int id) {
		for (Book book : showBookList()) {
			if(book.getBookId()==id)
				return book;
		}
		
		return null;
	}
	
	private List<Book> showBookList(){
		return Arrays.asList(
				new Book(1,"Learn Java","Kathy","tech",900.0),
				new Book(2,"7 Habits","steve","selfhelp",700.0),
				new Book(3,"c programmming","hayden","tech",1900.0),
				new Book(4,"learn c++","mike","tech",900.0)
				);
	}
	
	

}
