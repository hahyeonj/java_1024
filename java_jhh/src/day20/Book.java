package day20;

import java.util.Objects;

import lombok.Data;

@Data
public class Book {
	//필드 = > 객체를 나타내는 정보
	private String title, author, publisher, genre, isbn;
	private int price;
	
	//생성자 => 필드 초기화
	public Book(String title, String author, String publisher, String genre,
			String isbn, int price) {
		this.author = author;
		this.publisher = publisher;
		this.genre = genre;
		this.isbn = isbn;
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
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
		return Objects.equals(isbn, other.isbn);
	}
	
	//메소드 => 기능
	//getter, setter => @Date로 처리(또는 @Getter, @Setter로 처리)
	//toString 오버라이드 => 도서 정보를 간단하게 문자열로 만들기 위해 =>  @Date, @ㅆoString
	//equals => 상황에 따라 오버라이딩 => @Data, @EqualsAndHashCode
	
}
