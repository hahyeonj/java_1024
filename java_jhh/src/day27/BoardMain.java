package day27;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardMain {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		/* 게시글 관리 프로그램
		 * - 회원가입
		 *  - 처음 가입한 회원이 관리자, 그외 회원은 일반 회원
		 * - 로그인
		 * - 게시글 등록/수정/삭제=>회원만 가능
		 * - 카테고리 관리(공지, 자유)
		 * - 카테고리 추가/수정/삭제(관리자만 가능)
		 * */
		
		int menu = -1, logInMenu = -1;
		ArrayList<Member> member = new ArrayList<Member>();
		ArrayList<Board> board = new ArrayList<Board>();
		
		//로그인 // 회원가입 
		do { 
			printLogInMenu(logInMenu);
			runLogIn(logInMenu);
			printBar();
		}while(logInMenu = 1 && );
		
		//게시글 관리
		do {
			printMenu();
			menu = scan.nextInt();
			printBar();
			runMenu(menu, member, board);
			printBar();
		}while(menu != 5);
		
	}
	
	

	private static void runMenu(int menu, ArrayList<Member> member, ArrayList<Board> board) {
		switch(menu) {
		case 1:
			//게시글 등록
			
			
			
			
			
			break;
		case 2: 
			//게시글 수정(게시자, 관리자만)
			
			
			break;
		case 3:
			//게시글 삭제(게시자, 관리자만)			
			
			break;
		
		case 4:
			
			printStr("프로그램을 종료합니다.");
			break;
		default:
			printStr("잘못된 메뉴입니다.");
		}
		
	}
	private static void printMenu() {
		printStr("==========메 뉴===========");
		printStr("1. 게시글 등록");
		printStr("2. 게시글 수정");
		printStr("3. 게시글 삭제");
		
		printBar();
		System.out.print("메뉴 선택 : ");
		
	}
	private static void printLogInMenu(int logInMenu) {
		printStr("==========메 뉴===========");
		printStr("1. 로그인");
		printStr("2. 회원가입");
	}
	
	
	
	private static void printStr(String str) {
		printStr(str);
	}

	private static void printBar() {
		System.out.println("=========================");
	}	
}
