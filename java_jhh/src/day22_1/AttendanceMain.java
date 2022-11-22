package day22_1;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class AttendanceMain {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int menu = -1;
		Attendance attendance = new Attendance();
		do {
			printMenu();
			menu = scan.nextInt();
			scan.nextLine();
			System.out.println("=========================");
			runMenu(menu, attendance);
			
		}while(menu != 3);
		
		
		/* 출석부 관리 프로그램
		 * 1. 학생 등록
		 *  - 이름과 생년월일
		 * 2. 학생 수정
		 *  - 이름과 생년월일로 검색해서 이름과 생년월일 수정
		 * 3. 학생 삭제 
		 * - 이름과 생년월일로 검색해서 삭제
		 * 4. 학생 출결 확인
		 * - 이름과 생년월일로 검색해서 해당 학생의 모든 출결을 확인
		 * -2020-11-22 : O
		 * 5. 출석 확인
		 *  - 날짜 입력 : 2022-11-22
		 *  - 출석 : O, 지각: /, 조퇴:\, 결석 : X
		 *  홍길동 출석현황 :
		 *  고길동 출석현황 :
		 *  임꺽정 출석현황 :
		 * 6. 출석 수정
		 *  - 날짜 입력
		 *  - 수정할 학생의 이름과 생년월일 입력  
		 * 7. 출석 삭제
		 *  - 날짜 입력하여 해당 날짜 출석 삭제
		 * 8. 날짜별 출석 확인
		 *  - 날짜 입력하여 해당 날짜 모든 학생의 출석 여부를  확인
		 * 9. 프로그램 종료
		 * */
	}
	
	private static void pirntBar() {
		System.out.println("=============================");
	}
	private static void pirntStr(String str) {
		System.out.println(str);
		pirntBar();
	}
	
	private static void printMenu() {
		System.out.println("=============메뉴==============");
		System.out.println("1. 학생관리");
		System.out.println("2. 출석관리");
		System.out.println("3. 종료");
		System.out.println("=============메뉴==============");
		System.out.print("메뉴 선택 : ");
		pirntBar();
	}
	
	private static void printSubMenu(int menu) {
		switch(menu) {
		case 1:
			pirntStr("========학생 관리 메뉴========");
			pirntStr("1. 학생 추가");
			pirntStr("2. 학생 수정");
			pirntStr("3. 학생 삭제");
			pirntBar();
			pirntStr("메뉴 선택 : ");
			break;
		case 2:
			pirntStr("========출석 관리 메뉴========");
			pirntStr("1. 출석 체크 - 전체");
			pirntStr("2. 출석 확인 - 개별");
			pirntStr("3. 출석 확인 - 날짜별");
			pirntStr("4. 출석 수정");
			pirntStr("5. 출석 삭제");
			pirntStr("6. 취소");
			pirntBar();
			pirntStr("메뉴 선택 : ");
			break;
		default:
			pirntStr("잘못된 메뉴입니다.");
		}
		
	}
	
	private static void runMenu(int menu, Attendance attendance) {
		ArrayList<Student> stds = attendance.getStds();
		ArrayList<Log> logs = attendance.getLogs();
		
		switch(menu) {
		case 1:
			managementStudents(stds);
			break;
		case 2:
			//managementLogs(logs, stds);
			//학생정보가 변하기 때문에!
			break;
		case 3:
			pirntStr("프로그램 종료!!");
			break;
		default:
			pirntStr("잘못된 메뉴입니다.");
			
		}
		
	}

	private static void managementStudents(ArrayList<Student> stds) {
		printSubMenu(1);
		int subMenu = scan.nextInt();
		scan.nextLine();
		switch(subMenu) {
		case 1:		addStudent(stds);		break;
		case 2:		updateStudent(stds);	break;
		case 3:		deleteStudent(stds);	break;
		case 4:
			pirntStr("취소 했습니다.");
			break;
		default:
			pirntStr("메뉴를 잘못입력했습니다.");
		}
		
		
	}

	
	
	private static void addStudent(ArrayList<Student> stds) {
		if(stds == null)
			throw new RuntimeException("예외 발생 : 학생 정보를 관리하는 리스트가 없습니다.");
		pirntStr("이름 입력 : ");
		String name = scan.nextLine();
		pirntStr("생일 입력 : ");
		String birth = scan.nextLine();
		Student std = new Student(name, birth);
		if(stds.indexOf(std) != -1) {
			//equals오버라이딩 안한 이유(data 어노테이션에 포함)
			//이전에 한경우는 몇몇개만 비교하기 때문에 필요했음.
			pirntStr("학생 정보를 추가하지 못했습니다.");
			return;
		}
		stds.add(std);
		pirntStr("학생 정보를 추가했습니다.");
		
	}
	
	private static void updateStudent(ArrayList<Student> stds) {
		if(stds == null)
			throw new RuntimeException("예외 발생 : 학생 정보를 관리하는 리스트가 없습니다.");
		pirntStr("이름 입력 : ");
		String name = scan.nextLine();
		pirntStr("생일 입력 : ");
		String birth = scan.nextLine();
		Student std = new Student(name, birth);
		int index = stds.indexOf(std);//
		if( index == -1) {
			pirntStr("입력 정보와 일치하는 학생이 없습니다.");
			return;
		}
		pirntStr("수정할 이름 입력 : ");
		name = scan.nextLine();
		pirntStr("수정할 생일 입력 : ");
		birth = scan.nextLine();
		std = new Student(name, birth);
		stds.set(index, std);
		pirntStr("학생 정보를 수정했습니다.");
		System.out.println(stds);//확인용
		
		
	}
	
	private static void deleteStudent(ArrayList<Student> stds) {
		if(stds == null)
			throw new RuntimeException("예외 발생 : 학생 정보를 관리하는 리스트가 없습니다.");
		pirntStr("이름 입력 : ");
		String name = scan.nextLine();
		pirntStr("생일 입력 : ");
		String birth = scan.nextLine();
		Student std = new Student(name, birth);
		int index = stds.indexOf(std);//
		if( index == -1) {
			pirntStr("입력 정보와 일치하는 학생이 없습니다.");
			return;
		}
		stds.remove(index);
		pirntStr("학생 정보를 삭제했습니다.");
		
	}
}
/*	pirntStr("");
	switch(menu) {
	case 1:
		break;
	case 2:
		break;
	case 3:
		break;
	default:
		pirntStr("메뉴를 잘못입력했습니다.");
		printStr("잘못된 메뉴입니다.");
		
	}

}
*/