package com.bookapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
@Service
public class BookDAOImpl implements BookDAO {

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return showBookList();
	}

	@Override
	public List<Book> getByAuthor(String author) throws BookNotFoundException {
		List<Book> newBookList = new ArrayList<>();
		for (Book book : showBookList()) {
			if(book.getAuthor().equals(author))
				newBookList.add(book);
		}
		if(newBookList.isEmpty()) {
			throw new BookNotFoundException("author not found");
		}
		return newBookList;
				
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		// TODO Auto-generated method stub
		
		List<Book> newBookList = showBookList()
				.stream()
				.filter((book) -> book.getCategory().equals(category))
				.collect(Collectors.toList());
		if(newBookList.isEmpty()) {
			throw new BookNotFoundException("category not found");
		}
		return newBookList;
	}

	@Override
	public Book getById(int id) throws BookNotFoundException{
		return showBookList()
				.stream()
				.filter((book)-> book.getBookId()==id)
                .findAny()
				.orElseThrow(() -> new BookNotFoundException("id not found"));
	
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
