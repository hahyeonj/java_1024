package day19;

import java.util.Objects;

public class Book {
	
	private String bookName, company;
	private int price , ISBN;
	private String writer, genre;
	
	
	public Book(String bookName, String company, int price, int ISBN, String writer, String genre) {
		this.bookName = bookName;
		this.company = company;
		this.price = price;
		this.ISBN = ISBN;
		this.writer = writer;
		this.genre = genre;
	}
	

	public Book(String bookName, String writer, int price, String company, String genre, int iSBN) {
		this.bookName = bookName;
		this.writer = writer;
		this.price = price;
		this.company = company;
		this.genre = genre;
		this.ISBN = ISBN;
	}


	@Override
	public int hashCode() {
		return Objects.hash(ISBN, bookName, company, genre, price, writer);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return ISBN == other.ISBN && Objects.equals(bookName, other.bookName) && Objects.equals(company, other.company)
				&& Objects.equals(genre, other.genre) && price == other.price && Objects.equals(writer, other.writer);
	}


	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", company=" + company + ", price=" + price + ", ISBN=" + ISBN
				+ ", writer=" + writer + ", genre=" + genre + "]";
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getISBN() {
		return ISBN;
	}


	public void setISBN(int ISBN) {
		ISBN = ISBN;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}
	

	
	
	
	
	
	
	
	
}
