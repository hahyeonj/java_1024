package day15;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ListEx01 {

	public static void main(String[] args) {
		/* 
		 * ----------------------------
		 * 
		 * 메뉴
		 * 1. 할일 추가
		 * 2. 할일 확인
		 * 3. 할일 삭제
		 * 4. 종료
		 * 메뉴 선택 : 1
		 * ------------
		 * 할일 입력 : 저녁
		 * -------------
		 * 메뉴
		 * 1. 할일 추가
		 * 2. 할일 확인
		 * 3. 할일 삭제
		 * 4. 종료
		 * 메뉴 선택 : 2
		 * ---------------
		 * 1. 오후 수업 참여
		 * 2. 저녁
		 * ---------------
		 * 메뉴
		 * 1. 할일 추가
		 * 2. 할일 확인
		 * 3. 할일 삭제
		 * 4. 종료
		 * 메뉴 선택 : 3
		 * 1. 오후 수업 참여
		 * 2. 저녁
		 * 삭제할 할일 번호 선택  :1 
		 * 1번 할일이 삭제되었습니다.
		 * 메뉴
		 * 1. 할일 추가
		 * 2. 할일 확인
		 * 3. 할일 삭제
		 * 4. 종료
		 * 메뉴 선택 : 2
		 * ------------
		 * 1. 저녁
		 * ---------------
		 * 메뉴
		 * ---------------
		 * */
		//ArrayList<클래스명> todoList = new ArrayList<클래스명>();
		
		
		ArrayList<String> todoList = new ArrayList<String>();
		int menu = -1;
		Scanner scan = new Scanner(System.in);
		do { 
			//메뉴 출력
			printMenu();
				try{
					//메뉴 선택
					menu = scan.nextInt();
					//선택한 메뉴 실행
					runMenu(todoList, menu);
				}catch(InputMismatchException e) {
					System.out.println("-------------");
					System.out.println("에외발생 : 정수를 입력하세요.");
					System.out.println("--------------");
					
				}
				catch(Exception e) {
					System.out.println("-------------");
					System.out.println(e.getMessage());
					System.out.println("--------------");
				}
				
		}while(menu != 4);
		
		scan.close();	
	}
		
	private static void runMenu(ArrayList<String> todoList, int menu) throws Exception {
		Scanner scan = new Scanner(System.in);
		switch(menu){
		case 1 :
			//할일을 입력(공백 포함해서 입력)
			System.out.print("할일 : ");
			String todo = scan.nextLine();
			
			//리스트에 입력된 할일을 추가
			todoList.add(todo);
			
			break;
			
			
			
		case 2 :
			printTodoList();
			for(int i = 0; i<todoList.size(); i++) {
				System.out.print(i + 1 + ", " + todoList.get(i) + " ");
			}
			System.out.println();
			break;
			
		case 3 : 
			//할일 확인
			printTodoList();
			//삭제할 할일 번호를 입력
			System.out.println("삭제할 번호 입력");
			int index = scan.nextInt() - 1;
			if(index < 0 || index >= todoList.size()) {
				throw new Exception("예외 발생 : 삭제할 번호를 잘못 입력했습니다.")
			}
			
			//입력한 번호에 맞는 할일을 삭제
			todoList.remove(index);
			System.out.println("삭제가 완료되었습니다.");
			
			
			for(int i = 0; i<todoList.size(); i++) {
				if(todoList.size() == 0) {
					System.out.println("저장된 할일이 없습니다.");
				}
				System.out.print(i + 1 + ", " + todoList.get(i) + " ");
							}
			System.out.print("삭제할 번호 선택 : ");	
			int del = scan.nextInt();
			if(del <= 0 || del > todoList.size()){
				System.out.println("잘못된 번호를 입력하셨습니다."); 
				System.out.println();
			}
			todoList.remove(del-1);
			System.out.println("삭제가 완료되었습니다.");
			
			
			
			
			break;
			
		case 4 :
			System.out.println("프로그램 종료");
			break;
			
		default : 
			throw new Exception("에외발생 : 잘못된 메뉴입니다.");
		
		}
		scan.close();
	}



	


	private static void printMenu() {
		System.out.println("메뉴\r\n"
				+ "1. 할일 추가\r\n"
				+ "2. 할일 확인\r\n"
				+ "3. 할일 삭제\r\n"
				+ "4. 종료\r\n"
				+ "할일 : ");
		
	}

}
