package day24;

import java.util.ArrayList;
import java.util.Scanner;


public class StudentMain {
	/* 학생 정보를 관리 프로그램을 작성하세요.
	 * 1. 학생 추가(이름, 학년, 반, 번호)
	 * 2. 학생 출력
	 * 3. 종료
	 * - 프로그램 시작 전 학생 정보를 읽어오는 기능 추가(load)
	 * - 프로그램 종료 전 학생 정보를 저장하는 기능 추가(save)
	 * - 
	 * 
	 * */
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<Student> stds = new ArrayList<Student>();
		
		int menu = -1;
		
		//load();
		do {
			printMenu();
			menu = scan.nextInt();
			printBar();
			run(menu, stds);
		}while(menu != 3);
		//save();
	}

	private static void run(int menu, ArrayList<Student> stds) {
		switch(menu) {
		case 1: 	addStudent(stds); 	break;
		case 2:		printStudent(stds);	break;
		case 3:
			printStr("프로그램을 종료합니다.");
			break;
		default:
			printStr("잘못된 메뉴를 선택하셨습니다.");
			
		}
	}


	private static void printStudent(ArrayList<Student> stds) {
		for(Student std : stds) {
			printStr("");
			System.out.println("이름 : " + std.getName()+ " " + std.getGrade() +"학년 "
								+ std.getClassNum() + std.getNum() );
		}
		
	}

	private static void addStudent(ArrayList<Student> stds) {
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("학년 : ");
		int grade = scan.nextInt();
		System.out.print("반 : ");
		int classNum = scan.nextInt();
		System.out.print("번호 : ");
		int num =  scan.nextInt();
		Student std = new Student(name, grade, classNum, num);
		stds.add(std);
		printStr("학생을 추가했습니다.");
		
	}

	private static void printStr(String str) {
		
		
		System.out.println(str);
		printBar();
	}

	private static void printMenu() {
		 System.out.println("1. 학생 추가(이름, 학년, 반, 번호)");
		 System.out.println("2. 학생 출력");
		 System.out.println("3. 종료");
		 printBar();
		 System.out.print("메뉴 선택 : ");
	}


	private static void printBar() {
		System.out.println("========================");
	}
	
	
}
