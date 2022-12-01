package day28;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class BoardMain {
	private static Scanner scan = new Scanner(System.in);
	private static List<Member> memberList = new ArrayList<Member>();
	private static List<Board> boardList = new ArrayList<Board>();
	private static List<String> categoryList = new ArrayList<String>();
	private static Member user ; 
	/*
	 * 
	 *-기능1
	 *	- 회원관리
	 *	  - 로그인
	 *	  - 회원가입
 *		- 게시글 관리
		 *	  - 게시글 등록 (회원만)
		 *	  - 게시글 수정 (회원 + 작성자 본인)
		 *	  - 게시글 삭제 (회원 + 작성자 본인)
		 *	  - 게시글 목록
	 * 		- 게시글 검색(검색 번호는 게시글 번호로)
	 * 		- 게시글 확인
	 * 	- 카테고리 관리(회원 + 관리자만)
	 * 	  - 카테고리 추가
	 * 	  - 카테고리 수정
	 *    - 카테고리 삭제
	 */
	public static void main(String[] args) {
		int menu = -1;
		do {
			try {
				printMenu();
				menu = scan.nextInt();
				scan.nextLine();//위에서 입력한 엔터를 비움
				printBar();
				runMenu(menu);
			}catch(InputMismatchException e) {
				scan.nextLine();//잘못된 문자열들을 비워 줌
				printStr("숫자를 입력하세요.");
			}catch(Exception e) {
				printStr(e.getMessage());
			}
		}while(menu != 4);
		saveMember("member.txt");
		saveCategory("category.txt");
		saveBoard("board.txt");
	}
	private static void saveBoard(String filename) {
		try(ObjectOutputStream oos
				= new ObjectOutputStream(new FileOutputStream(filename))) {
			oos.writeInt(Board.getCount());
			for(Board board : boardList) {
				oos.writeObject(board);
			}
			printStr("저장 완료");
		}catch(IOException e){
			printStr("저장 실패");
			e.printStackTrace();
		}
	}
	
	private static void saveCategory(String filename) {
		if(categoryList.size() == 0)
			return;
		try(ObjectOutputStream oos
				= new ObjectOutputStream(new FileOutputStream(filename))) {
			for(String category : categoryList) {
				oos.writeObject(category);
			}
			System.out.println("저장 완료");
		}catch(IOException e){
			printStr("저장 실패");
		}
	
	}
	private static void saveMember(String filename) {
		if(memberList.size() == 0)
			return;
		try(ObjectOutputStream oos
				= new ObjectOutputStream(new FileOutputStream(filename))) {
			for(Member member : memberList) {
				oos.writeObject(member);
			}
			System.out.println("저장 완료");
		}catch(IOException e){
			printStr("저장 실패");
		}
	}
	private static void runMenu(int menu) {
		switch(menu) {
		case 1:
			memberMenu();
			break;
		case 2:
			boardMenu();
			break;
		case 3:
			categoryMenu();
			break;
		case 4:
			printStr("프로그램 종료");
			break;
		default:
			throw new RuntimeException("잘못된 메뉴를 선택했습니다.");
		}
	}
	private static void categoryMenu() {
		//관리자 체크 => 관리자가 아니면 메인메뉴로
		if(isAdmin()) {
			return;
		}
		int submenu = -1;
		do {
			//서브 메뉴를 출력
			printSubmenu(3);
			//서브 메뉴 선택 및 선택한 서브 메뉴에 맞는 기능 실행
			submenu = scan.nextInt();
			scan.nextLine();
			printBar();
			switch(submenu) {
			
			case 1:
				//1. 카테고리 추가
				insertCategory();
				break;
			
			case 2:
				//2. 카테고리 수정
				updateCategory();
				System.out.println(categoryList);
				break;
			case 3:
				//3.카테고리 삭제
				delelteCategory();
				break;
			
			case 4:
				//4. 카테고리 확인
				printCategory();
				
				
				break;
			//5. 이전
			case 5:
				printStr("이전 메뉴로 돌아갑니다.");
				break;
			default:
				printStr("잘못된 메뉴를 선택했습니다.");
			}
			}while(submenu != 5);
	}
	private static void printCategory() {
		//모든 카테고리 출력
		if(categoryList.size( ) == 0) {
			printStr("등록된 카테고리가 없습니다.");
			return;
		}
		for(int i = 0; i< categoryList.size(); i++) {
			System.out.println(i+1+". " + categoryList.get(i));
		}
		printBar();
	}
	private static void delelteCategory() {
		//삭제할 카테고리명 입력
		System.out.print("카테고리명 : ");
		String category = scan.nextLine();
		printBar();
		//기존 카테고리에 있으면 삭제
		if(categoryList.remove(category)) {
			printStr("카테고리를 삭제했습니다.");
			return;
		}
		printStr("등록되지 않은 카테고리입니다.");
	}
	private static void updateCategory() {
		//수정할 카테고리명 입력
		System.out.print("카테고리명 : ");
		String category = scan.nextLine();
		printBar();
		//기존 카테고리에 있으면
		if(!categoryList.contains(category)) {
			printStr("등록되지 않은 카테고리입니다. 수정 실패");
			return;
		}
		//새 카테고리명 입력
		System.out.print("카테고리명 : ");
		String newCategory = scan.nextLine();
		printBar();
		//기존 카테고리에 있는지 확인하여 없으면 수정
		if(!categoryList.contains(newCategory)) {
			categoryList.remove(category);
			categoryList.add(newCategory);
			printStr("등록되지 않은 카테고리입니다. 수정 실패");
			return;
		}
		printStr("이미 등록된 카테고리입니다.");
	}
	private static void insertCategory() {
		//새 카테고리명 입력
		System.out.print("카테고리명 : ");
		String category = scan.nextLine();
		printBar();
		//기존 카테고리에 있는지 확인하여 없으면 추가
		if(categoryList.indexOf(category) == -1) {
			categoryList.add(category);
			printStr("새 카테고리를 추가했습니다.");
			return;
		}
		printStr("이미 있는 카테고리입니다.");
	}
	private static boolean isAdmin() {
		if(user == null || user.getAuthority() == Authority.ADMIN) {
			printStr("관리자가 아닙니다. 해당 기능을 이용할 수 없습니다.");
			return false;
		}
		return true;
	}
	private static void boardMenu() {
		int submenu = -1;
		do {	
			//서브 메뉴를 출력
			printSubmenu(2);
			//서브 메뉴 선택 및 선택한 서브 메뉴에 맞는 기능 실행
			submenu = scan.nextInt();
			scan.nextLine();
			printBar();
			
			runBoardMenu(submenu);
				
		}while(submenu != 5);	
	}
	private static void runBoardMenu(int submenu) {
		switch(submenu) {
		//1. 게시글 등록
		case 1: 
			insertBoard();
			
			break;
		//2. 게시글 수정
		case 2: 
			updateBoard();
	
			break;
		//3. 게시글 삭제
		case 3:
			deleteBoard();
			break;
		//4. 게시글 목록
		case 4 :
			printBoard();
			break;
		//5. 이전
		case 5:
			printStr("이전 메뉴로 돌아갑니다.");
			break;
		default:
			printStr("잘못된 메뉴를 선택했습니다.");	
			break;
		}
	}
	private static void printBoard() {
		int detailMenu = -1;
		do {
			//디테일 메뉴 출력
			printDetailMenu();
			//서브 메뉴 선택 및 기능 실행
			detailMenu = scan.nextInt();
			scan.nextLine();
			printBar();
			runPrintMenu(detailMenu);
			
		}while(detailMenu != 4);
	}
	private static void runPrintMenu(int detailMenu) {
		switch(detailMenu) {
		//1. 게시글 목록 확인
		case 1:
			//모든 게시글 확인
			printBoardListAll();
			break;
		//2. 게시글 검색
		case 2:
			//검색어 입력 후 게시글 확인
			printBoardSearch();
			break;
		//3. 게시글 확인
		case 3:
			//게시글 번호를 입력
			printBoardDetail();
			//입력한 게시글이 있으면 확인
			break;
		//4. 이전
		case 4:
			printStr("이전 메뉴로 돌아갑니다.");
			break;
		default:
			printStr("잘못된 메뉴를 선택했습니다.");
		}
	}
	private static void printBoardDetail() {
			System.out.print("게시글 번호 : ");
			int num = scan.nextInt();
			scan.nextLine();
			int index = boardList.indexOf(new Board(num));
			if(index == -1) {
				printStr("등록되지 않거나 삭제된 게시글입니다.");
				return;
			}
			Board board = boardList.get(index);
			int views = board.getViews();
			board.setViews(views + 1);
			board.print();
			printBar();
	}
	private static void printBoardSearch() {
		System.out.print("검색어 : ");
		String search = scan.nextLine();
		printBoardList(s->s.getTitle().contains(search));
		
	}
	private static void printBoardListAll() {
		printBoardList(s->true);
	}
	private static void printBoardList(Predicate<Board> p) {
		if(boardList.size() == 0) {
			printStr("등록된 게시물이 없습니다.");
			return;
		}
		for(Board tmp : boardList) {
			if(p.test(tmp))
				System.out.println(tmp);
		}
	}
	private static void printDetailMenu() {
		System.out.println("=====게시글 목록메뉴======");
		System.out.println("1. 게시글 목록 확인");
		System.out.println("2. 게시글 검색");
		System.out.println("3. 게시글 확인");
		System.out.println("4. 이전");
		printBar();
	}
	private static void deleteBoard() {
		//삭제할 게시글 번호 입력
		//회원 체크 => 회원(로그인한 사용자)이 아니면 게시글 등록 못함
			if(checkLogin(false)) {
				return;
			}
			System.out.print("게시글 번호 : ");
			int num = scan.nextInt();
			scan.nextLine();
			int index = boardList.indexOf(new Board(num));
		//해당 게시글이 존재하지 않거나 작성자가 회원과 같지 않으면 삭제 못함
			//작성자 체크 => 회원(로그인한 사용자)이 아니면 게시글 등록 못함
			if(index == -1) {
				printStr("동록되지 않거나 삭제된 게시글입니다.");
				return;
			}
			Board board = boardList.get(index);
			if(!board.getWriter().equals(user.getId())) {
				
				printStr("작성자가 아닌 사용자는 삭제할 수 없습니다.");
				return;
			}
			//해당 게시글 삭제
			boardList.remove(index);
			printStr("게시글 삭제가 완료됐습니다.");
	}
	private static void updateBoard() {
		//회원 체크 => 회원(로그인한 사용자)이 아니면 게시글 등록 못함
		if(checkLogin(false)) {
			return;
		}
		System.out.print("게시글 번호 : ");
		int num = scan.nextInt();
		scan.nextLine();
		int index = boardList.indexOf(new Board(num));
		//해당 게시글이 존재하지 않거나 작성자가 회원과 같지 않으면 수정 못함
				//작성자 체크 => 회원(로그인한 사용자)이 아니면 게시글 등록 못함
		if(index == -1) {
			printStr("동록되지 않거나 삭제된 게시글입니다.");
			return;
		}
		Board board = boardList.get(index);
		if(!board.getWriter().equals(user.getId())) {
			
			printStr("작성자가 아닌 사용자는 수정할 수 없습니다.");
			return;
		}
		//게시글 정보(제목, 내용) 입력
		String category = null;
		do {
			if(category != null)
				
				printStr("등록되지 않은 카테고리입니다.");
			System.out.print("카테고리 : ");
			category = scan.nextLine();
		}while(!categoryList.contains(category));
		
		
		System.out.print("제목 : ");
		String title = scan.nextLine();
		System.out.print("내용 : ");
		String contents = scan.nextLine();
		printBar();
		//게시글을 수정
		board.update(title, contents);
		printStr("게시글 수정이 완료됐습니다.");
		
	}
	private static void insertBoard() {
		//회원 체크 => 회원(로그인한 사용자)이 아니면 게시글 등록 못함
		if(checkLogin(false)) {
			return;
		}
		//게시글 정보(제목, 내용) 입력
		
		String category = null;
		do {
			if(category != null)
				
				printStr("등록되지 않은 카테고리입니다.");
			System.out.print("카테고리 : ");
			category = scan.nextLine();
		}while(!categoryList.contains(category));
		System.out.print("제목 : ");
		String title = scan.nextLine();
		System.out.print("내용 : ");
		String contents = scan.nextLine();
		printBar();
		//게시글 등록
		Board board = new Board(title, contents, user.getId(), category);
		boardList.add(board);
		printStr("게시글 등록이 완료됐습니다.");
	}
	private static void memberMenu() {
		//로그인 체크 => 로그인 한 사람은 로그인/ 회원가입 시도를 할 수없게 하기 위해
		if(checkLogin(true))
			return;
		int submenu = -1;
		loadMember("member.txt");
		loadCategory("category.txt");
		do {
			//서브 메뉴를 출력
			printSubmenu(1);
			//서브 메뉴 선택 및 선택한 서브 메뉴에 맞는 기능 실행 =>반본
			submenu = scan.nextInt();
			scan.nextLine();
			submenu = runMemberMenu(submenu);
		}while(submenu != 3);
	}
	private static void loadBoard(String filename) {
		try(ObjectInputStream ois
				= new ObjectInputStream(new FileInputStream(filename))) {
			int count = ois.readInt();
			Board.setCount(count);
			while(true) {
				Board board = (Board)ois.readObject();
				boardList.add(board);	
			}
		}catch(ClassNotFoundException e) {
			printStr("불러오기 실패");
		}catch(EOFException e) {
			printStr("불러오기 성공");
		}catch(IOException e){
			printStr("불러오기 실패");
		}
	}
	
	private static void loadCategory(String filename) {
		try(ObjectInputStream ois
				= new ObjectInputStream(new FileInputStream(filename))) {
			while(true) {
				String category = (String)ois.readObject();
				categoryList.add(category);	
			}
		}catch(ClassNotFoundException e) {
			printStr("불러오기 실패");
		}catch(EOFException e) {
			if(categoryList.size() == 0)
				categoryList
					= new ArrayList<String>(Arrays.asList("공지", "자유"));
			printStr("불러오기 성공");
		}catch(IOException e){
			printStr("불러오기 실패");
		}
	}
	private static void loadMember(String filename) {
		try(ObjectInputStream ois
				= new ObjectInputStream(new FileInputStream(filename))) {
			while(true) {
				Member member = (Member)ois.readObject();
				memberList.add(member);	
			}
		}catch(ClassNotFoundException e) {
			printStr("불러오기 실패");
		}catch(EOFException e) {
			printStr("불러오기 성공");
		}catch(IOException e){
			printStr("불러오기 실패");
		}
	}
	private static int runMemberMenu(int submenu) {
		switch(submenu) {
		//1.회원가입
		case 1:
			signup();
			break;
		//2. 로그인
		case 2:
			login();
			//로그인이 성공하면 서브 메뉴를 3으로 수정하여 자동으로 메인으로 이동하게 함
			if(user != null)
				return 3;
			break;
		//3. 이전
		case 3:
			printStr("이전 메뉴로 돌아갑니다.");
			break;
		default:
			printStr("잘못된 메뉴를 선택했습니다.");
			
		}
		return submenu;
	}
	private static void login() {
		//회원 정보 입력(아이디, 비번)
		System.out.println("로그인 정보 입력");
		Member member = inputMember();
		//일치하는 회원이 있으면 회원 정보를 가져옴(로그인 성공)
		int index = memberList.indexOf(member);
		if(index == -1) {
			printStr("로그인 실패");
			return;
		}
		user = memberList.get(index);
		printStr("로그인 성공");
	}
	private static void signup() {
		//회원정보 입력
		System.out.println("회원 정보 입력");
		Member member = inputMember();
		//가입된 아이디인지 체크
		if(isMember(member)) {
			printStr("이미 가입된 아이디입니다.");
			return;
		}
		//가입된 아이디가 아니면 회원가입 진행
		memberList.add(member);
	}
	private static boolean isMember(Member member) {
		if(member == null)
			return false;
		if(memberList == null)
			memberList = new ArrayList<Member>();
		if(memberList.size() == 0)
			return false;
		for(Member tmp : memberList) {
			if(tmp.getId().equals(member.getId())) {
				return true;
			}
		}
		return false;
	}
	private static Member inputMember() {
		System.out.print("아이디 : ");
		String id = scan.nextLine();
		System.out.println("비밀번호 : ");
		String pw = scan.nextLine();
		Authority authority = memberList.size() == 0 ? Authority.ADMIN : Authority.MEMBER; 
		return new Member(id, pw, authority);
	}
	private static void printSubmenu(int menu) {
		switch(menu) {
		case 1:
			System.out.println("=====회원관리메뉴======");
			System.out.println("1. 회원 가입");
			System.out.println("2. 로그인");
			System.out.println("3. 이전");
			break;
		case 2:
			System.out.println("=====회원관리메뉴======");
			System.out.println("1. 게시글 등록");
			System.out.println("2. 게시글 수정");
			System.out.println("3. 게시글 삭제");
			System.out.println("4. 게시글 목록");
			System.out.println("5. 이전");
			break;
		case 3 : 
			System.out.println("=====카테고리관리메뉴======");
			System.out.println("1. 카테고리 등록");
			System.out.println("2. 카테고리 수정");
			System.out.println("3. 카테고리 삭제");
			System.out.println("4. 카테고리 목록");
			System.out.println("5. 이전");
		}
		printBar();
		System.out.print("메뉴 선택 : ");
	}
	private static boolean checkLogin(boolean res) {
		if(user != null && res) {
			printStr("로그인한 회원은 해당 기능을 이용할 수 없습니다.");
			return true;
		}
		if(user == null && !res){
			printStr("로그인하지 않은 사용자는 해당 기능을 이용할 수 없습니다.");	
			return true;
		}		
		return false;
	}
	private static void printMenu() {
		System.out.println("========메뉴========");
		System.out.println("1. 회원 관리");
		System.out.println("2. 게시글 관리");
		System.out.println("3. 카테고리 관리");
		System.out.println("4. 프로그램 종료");
		printBar();
		System.out.print("메뉴 선택 : ");
	}

	private static void printBar() {
		System.out.println("=============================");
	}

	private static void printStr(String str) {
		System.out.println(str);
		printBar();
	}
}
