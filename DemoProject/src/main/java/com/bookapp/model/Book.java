package com.bookapp.model;

public class Book {

	Integer bookId;
	String title;
	String author;
	String catrgory;
	Double price;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(Integer bookId, String title, String author, String catrgory, Double price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.catrgory = catrgory;
		this.price = price;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCatrgory() {
		return catrgory;
	}

	public void setCatrgory(String catrgory) {
		this.catrgory = catrgory;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", catrgory=" + catrgory
				+ ", price=" + price + "]";
	}
	
	
	
}
