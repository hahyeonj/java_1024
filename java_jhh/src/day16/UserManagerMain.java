package day16;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UserManagerMain {

	public static void main(String[] args) {
		/* 회원정보를 관리하는 프로그램을 작성하세요.
		 * - 회원정보는 아이디, 비번, 이름, 나이, 주민번호
		 * - 기능1 : 회원 추가
		 * - 기능2 : 회원 검색
		 * - 기능3 : 회원 정보 수정
		 * - 기능4 : 회원 삭제
		 * */
		
		//반복
		int menu = -1;		
		Scanner scan = new Scanner(System.in);
		ArrayList<Member1> list = new ArrayList<Member1>();//회원 리스트
		do {
			//메뉴 출력
			printMenu();
			//메뉴를 선택(입력)
			menu = scan.nextInt();
			//선택된 메뉴에 따른 기능 실행
			switch(menu) {
			
			case 1:
				if(addMember(list)) {
					ptintStr("입력한 회원 정보를 추가했습니다.");
				}else {
					ptintStr("입력한 아이디가 이미 존재합니다.");
				}
				break;
			case 2:
				Member1 tmp = searchMember(list);
				if(tmp == null) {
					ptintStr("아이디 또는 또는 비밀번호가 잘못됐습니다.");
				}else {
					System.out.println(tmp);
				}
				break;
			case 3:
				//수정할 회원 아이디와 비번을 입력하여 일치하는 회원정보를 가져옴
				Member1 updateTmp = searchMember(list);
				
				//일치하지 않으면 건너뜀
				if(!updateMember(list, updateTmp)) {
					ptintStr("아이디 또는 비밀번호가 잘못됐습니다.");
					
				}else {
					ptintStr("회원 정보 수정이 완료됐습니다.");
				}
				
				
				
				//delMember(list);
			
				/*
				Scanner scan = new Scanner(System.in);
				
				//아이디 입력
				System.out.println("삭제할 회원 정보를 입력하세요.");
				System.out.println("아이디 : ");
				String id = scan.next();
				
				
				//비번 입력
				System.out.println("비번  : ");
				String pw = scan.next();
				
				//아이디, 비번을 이용하여 객체를 만듬
				Member1 member = new Member1(id, pw);
				
				//회원 리스트에서 아이디가 같은 회원 정보를 가져옴
				int index = list.indexOf(member);
				if(index == -1) {
					return;
				}
				Member1 tmp = list.get(index);
				
				break;
				*/
			case 4:
				//삭제할 회원 아이디와 비번을 입력하여 일치하는 회원정보를 가져옴
				Member1 deleteTmp = searchMember(list);
				//일치하는 회원 정보가 있으면 삭제
				if(list.remove(deleteTmp)) {
					ptintStr("삭제가 완료됐습니다.");
				}else {
					ptintStr("아이디 또는 비밀 번호가 잘못됐습니다.");
				}
				//delMember(list);
			case 5:
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("잘못된 메뉴");
			
			}
			
		}while(menu != 5);
		
	}
	
	public static boolean updateMember(ArrayList<Member1> list, Member1 updateTmp) {
		//일치하지 않으면 건너뜀
		if(updateTmp == null) {
			return false;
		}
		Scanner scan = new Scanner(System.in);
		//일치하는 회원 정보가 있으면 비번, 이름, 주민번호, 나이를 입력받음
		System.out.print("비번 : ");
		String pw = scan.next();
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("주민번호 : ");
		String residentNumber = scan.next();
		System.out.print("나이 : ");
		int age = scan.nextInt();
		
		//입력받은 회원 정보를 이용하여 updateTmp를 수정
		updateTmp.update(pw, name, residentNumber, age);
		return true;
		
	}
	

	public static void delMember(ArrayList<Member1> list) {
			Scanner scan = new Scanner(System.in);
			
			//아이디 입력
			System.out.println("삭제할 회원 정보를 입력하세요.");
			System.out.println("아이디 : ");
			String id = scan.next();
			
			
			//비번 입력
			System.out.println("비번  : ");
			String pw = scan.next();
			
			//아이디, 비번을 이용하여 객체를 만듬
			Member1 member = new Member1(id, pw);
			
			//회원 리스트에서 아이디가 같은 회원 정보를 가져옴
			int index = list.indexOf(member);
			if(index == -1) {
				return;
			}
			Member1 tmp = list.get(index);
			
			
			//다시 한번더 삭제에 대한 의사를 물음
			System.out.println("회원정보 : " + tmp
					+ "이대로 삭제가 되면 모든 정보가 그대로 삭제됩니다."
					+ "진짜로 삭제하시겠습니까?");
			System.out.println("1. 삭제");
			System.out.println("2. 취소");
			int delNum = scan.nextInt();
			if(delNum == 1) {
				//비번 입력
				System.out.println("비번  : ");
				pw = scan.next();
				//가져온 회원 정보의 비번과 입력한 비번을 비교하여 //다르면 종료
				if(!tmp.getPw().equals(member.getPw())) {
					return;
				}
				//같으면 삭제!
				list.remove(index);
				System.out.println("삭제가 완료되었습니다.");	
				return;
				//
				
			}
			if(delNum ==2) {
				return;
			}
		}
		public static Member1 searchMember(ArrayList<Member1> list) {
			Scanner scan = new Scanner(System.in);
			
			//아이디 입력
			System.out.println("검색할 회원 정보를 입력하세요.");
			System.out.println("아이디 : ");
			String id = scan.next();
			
			//비번 입력
			System.out.println("비번  : ");
			String pw = scan.next();
			
			//아이디, 비번을 이용하여 객체를 만듬
			Member1 member = new Member1(id, pw);
			
			//회원 리스트에서 아이디가 같은 회원 정보를 가져옴
			int index = list.indexOf(member);
			if(index == -1) {
				return null;
			}
			Member1 tmp = list.get(index);
			
			//가져온 회원 정보의 비번과 입력한 비번을 비교하여 //다르면 종료
			if(!tmp.getPw().equals(member.getPw())) {
				return null;
			}
			//같으면 회원정보를 보여줌
			
			return tmp;
			
		}

	public static void printMenu() {
		System.out.println("------------메뉴------------");
		System.out.println("1.회원 추가");
		System.out.println("2. 회원 검색");
		System.out.println("3. 회원 정보 수정");
		System.out.println("4. 회원 삭제");
		System.out.println("---------------------------");
		System.out.println("메뉴선택 : ");
	}
	
	public static boolean addMember(ArrayList<Member1> list){
		Scanner scan = new Scanner(System.in);
		//회원 정보 입력
		//아이디, 비번, 이름, 주민번호, 나이 순으로
		System.out.println("회원 정보를 입력하세요.");
		System.out.print("아이디 : ");
		String id = scan.next();
		System.out.print("비번 : ");
		String pw = scan.next();
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("주민번호 : ");
		String residentNumber = scan.next();
		System.out.print("나이 : ");
		int age = scan.nextInt();
		
		//입력한 정보를 이용한 객체를 생성(회원 리스트에 비교 및 추가)
		Member1 member = new Member1(id, pw, name, residentNumber, age);
		
		//회원 리스트에 이미 가입된 아이디이면 안내문구 출력 후
		if(list.contains(member) ) {
			//건너뜀
			
			ptintStr("입력한 아이디가 이미 존재합니다.");
			
			continue;
		}
		
		//아니면 회원리스트에 member 객체를 추가
		list.add(member);
		
		ptintStr("입력한 회원 정보를 추가했습니다.");
		
		return true;
	}
	
	public static void ptintStr(String str) {
		System.out.println("---------------");
		System.out.println(str);
		System.out.println("---------------");
	}
	
	

}
