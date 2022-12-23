package db.day1;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		static Scanner scan = new Scanner(System.in);
		static StudentDB stdDB;
		
		String url = "jdbc:mysql://localhost/university";
        String id = "root";
        String pw = "root";
        
        StudentDB stdDB = null;
        
        try {
        	stdDB = new StudentDB(url, id, pw);
        }catch(Exception e) {
        	System.out.println("[DB연결 실패]");
        	System.out.println("[프로그램 종료]");
        	return;
        }
		
        int menu = -1;
    	do{
        	
	        printMenu();  
	        menu = scan.nextInt();
	        runMenu(menu);
	       
	        }
    	}while(menu != 3);
        
		
		
	}
	
	private static void runMenu(int menu) {
		switch(menu){
     	case 1:
     		
     		insertStudent(con, Student1);
     		break;
     	case 2:
     		
     		break;
     	case 3:
     		System.out.println("프로그램을 종료합니다.");
     		break;
 		default:
 			System.out.println("잘못된 메뉴입니다.");
		}
	}

	private static void printMenu() {
		System.out.println("메뉴");
        System.out.println("1. 조회");
        System.out.println("2. 추가");
        System.out.println("3. 종료");
        System.out.print("메뉴 선택 : ");
        System.out.println();
	}

	
	
}
