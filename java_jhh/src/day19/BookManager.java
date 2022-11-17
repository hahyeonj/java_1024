package day19;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Predicate;

import lombok.Data;

@Data
public class BookManager {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		/* 도서정보
		 * - 도서명, 저자(여러명, 엮은이, 옮긴이 다 포함), 가격, 출판사, 장르, ISBN
		 * */
		
		ArrayList<Book> list = new ArrayList<Book>();
		
		int menu = 0 ;
		
		printMenu();
		
		System.out.println();
		
		
		switch(menu) {
		case 1:
			try {
				insertBook(list, inputBook(scan));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			break;
		case 2:
			
			break;
		
		default:
			System.out.println("잘못된 메뉴를 선택하셨습니다.");
	
		}
	}
		
	public static Book inputBook(Scanner scan) throws ParseException {
		System.out.println("도서명 : ");
		String bookName = scan.nextLine();
		//복수 입력 관련 찾아볼것
		System.out.println("저자 : ");
		String writer = scan.nextLine();
		System.out.println("가격 : ");
		int price = scan.nextInt();
		System.out.println("출판사 : ");
		String company = scan.nextLine();
		System.out.println("장르 : ");
		String genre = scan.next();
		scan.nextLine();		
		System.out.println("ISBN");
		int ISBN = scan.nextInt();
		
		return new Book(bookName, writer, price, company, genre, ISBN);	
		
	}
	
	public static void insertBook(ArrayList<Book> list, Book book) {
		Collections.sort(list,new Comparator<Book>() {
			public int compare(Book o1, Book o2) {
				if(o1 == null)
					return 1;
				if(o2 == null)
					return -1;
				return o1.getISBN().compareTo(o2.getISBN());
			}
		});
	}
	
	
	private static void printMenu() {
		System.out.println("------------------");
		System.out.println("----메뉴----");
		System.out.println("1. 도서 추가");
		System.out.println("2. 도서 조회");
		System.out.println("------------------");
	}
	
	public static void print(ArrayList<Book> list, Predicate<Book> p, Scanner scan) {
		
		for(Book tmp : list) {
			if(p.test(tmp)) {
				System.out.println(tmp);
		
			}
		}
	}
}
