package day30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day28.Board;

/* 기능
 *  - 게시글 등록 
 *  - 게시글 수정
 *  - 게시글 삭제
 *  - 게시글 목록
 *  - 게시글 확인
 * 	  - 댓글 등록
 * 	  - 댓글 확인
 * 	  - 이전
 *  - 프로그램 종료
 * */

public class BoardMain {

	
	private static Scanner scan = new Scanner(System.in);
	private static List<Board> boardList = new ArrayList<Board>();
	/* 기능*/
	public static void main(String[] args) {
		
		//메뉴를 출력하고, 
		//메뉴를 입력받아 입력한 메뉴가 프로그램 종료가 아니면 반복하는 코드를 작성
		
		int menu = -1;
		while(menu != 6) {
			printMenu();
			menu = scan.nextInt();
		}
	}
		/** 메뉴를 출력하는 메소드
		 *  - 게시글 등록 
		 *  - 게시글 수정
		 *  - 게시글 삭제
		 *  - 게시글 목록
		 *  - 게시글 확인
		 *  - 프로그램 종료
	 */
	public static void printMenu() {
		System.out.println("메뉴");
		System.out.println("1. 게시글 등록");
		System.out.println("2. 게시글 수정");
		System.out.println("3. 게시글 삭제 ");
		System.out.println("4. 게시글 목록");
		System.out.println("5. 게시글 확인");
		System.out.println("6. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
	
	}
		

		/**runMenu
		 * 메뉴가 주어지면 주어진 메뉴에 맞는 기능을 출력하는 메소드
		 * @param menu 선택된 메뉴로 정수
		 */
	public static void runMenu(int menu) {
		switch(menu) {
		case 1:
			insertBoard();
			break;
		case 2:
			updateBoard();
			break;
		case 3:
			deleteBoard();
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("잘못 선택했습니다.");
		
		}
	}
	
	/**insertBoard
	 * 게시글 정보를 입력받아 게시글을 출력하는 메소드
	 * 메소드 구현에 필요한 필드를 추가해도 됨
	 */
	public static void insertBoard() {
		//게시글 정보 입력
		System.out.print("번호 : ");
		int num = scan.nextInt();
		scan.nextLine();
		
		System.out.print("제목 : ");
		String title = scan.nextLine();
		
		System.out.print("내용 : ");
		String writer = scan.nextLine();
		
		System.out.print("작성자 : ");
		String contents = scan.nextLine();
		//게시글 객체 생성
		Board board = new Board(num, title, contents, writer);
		//번호 중복 확인
		if(boardList.contains(board)) {
			System.out.println("중복된 번호가 있습니다.");
		}
		//게시글 리스트에 추가
		boardList.add(board);
		System.out.println(boardList);
		
	}
	 
}
