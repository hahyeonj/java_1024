package day22_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AttendanceMain {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int menu = -1;
		Attendance attendance = new Attendance();
		do {
			try {
				printMenu();
				menu = scan.nextInt();
				scan.nextLine();
				System.out.println("=========================");
				runMenu(menu, attendance);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
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
	}
	
	private static void printSubMenu(int menu) {
		switch(menu) {
		case 1:
			pirntStr("========학생 관리 메뉴========");
			pirntStr("1. 학생 추가");
			pirntStr("2. 학생 수정");
			pirntStr("3. 학생 삭제");
			pirntBar();
			System.out.println("메뉴 선택 : ");
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
			System.out.println("메뉴 선택 : ");
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
			managementLogs(logs, stds);
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

	private static void managementLogs(ArrayList<Log> logs, ArrayList<Student> stds) {
		printSubMenu(2);
		int subMenu = scan.nextInt();
		scan.nextLine();
		pirntBar();
		switch(subMenu) {
		case 1:	
			checkLog(logs, stds);
			sortLogs(logs);//일지 정렬
			break;
		case 2:	
			printLogsByStudent(logs);
			break;
		case 3:	
			printLogsByDate(logs);	
			break;
		case 4:	
			updateLogs(logs);
			break;
		case 5:		
			deleteLogs(logs);
			break;
		case 6:	pirntStr("취소합니다.");	break;	
		default:pirntStr("잘못된 메뉴입니다.");
		}
	}
	
	private static void checkLog(ArrayList<Log> logs, ArrayList<Student> stds) {

		// 날짜 입력
		pirntStr("출석 일자(예:2022.11.23) : ");
		String date = scan.nextLine();
		//이미 입력된 날짜인지 확인
		if(checkLogDate(logs, date)) {
			pirntStr("이미 출석 체크한 일자입니다.");
			return;
		}
		//출석 상태 정보 출력(결석 : X, 출석 : O, 지각 : /, 조퇴 : \)
		pirntStr("결석 : X, 출석 : O, 지각 : /, 조퇴 : \\");
		
		//StudentLog를 리스트로 생성
		ArrayList<StudentLog> stdLogs = new ArrayList<StudentLog>();
		
		//홍길동(20.05.05) : O

		// 반복
		for(Student std : stds) {
			//StudentLog를 생성
			//학생 이름과 생일 출력
			System.out.println(std.getName() + "(" + std.getBirthday() + ") : " );
			//출석 상태 입력
			String state = scan.nextLine();
			//StudentLog를 생성
			StudentLog stdLog = new StudentLog(std, state);
			//StudentLog 리스트에 추가 
			stdLogs.add(stdLog);
		}
		//StudentLog 리스트와 날짜를 이용하여 Log 객체를 생성
		Log log = new Log(stdLogs, date);
		//Log 리스트에 생성된 Log 객체를 추가
		logs.add(log);
		
	}

	private static boolean checkLogDate(ArrayList<Log> logs, String date) {
		if(logs == null || date == null)
			throw new RuntimeException("일지 리스트가 없거나 날짜가 없습니다.");
		if(logs.size() == 0)
			return false;
		for(Log log : logs) {
			if(log.getDate().equals(date))
				return true;
		}
		return false;
	}

	private static void sortLogs(ArrayList<Log> logs) {
		if(logs ==null || logs.size() == 0)
			return;
		Collections.sort(logs, (o1, o2)->o1.getDate().compareTo(o2.getDate()));
	}
	
	private static void printLogsByStudent(ArrayList<Log> logs) {
		if(logs == null || logs.size() == 0) {
			pirntStr("등록도니 출석체크가 없습니다.");
			return;
		}
		//이름을 입력
		System.out.print("이름 : ");
		String name = scan.nextLine();
		pirntBar();
		//입력받은 이름과 일치하는 출석체크 목록을 확인
		//2022.11.23 : O
		for(Log log : logs) {
			for(StudentLog slog : log.getSlogs()) {
				if(slog.getStd().getName().equals(name)) {
					System.out.println(log.getDate() + " : " + slog.getState());
					
				}
			}
		}
	}
	
	private static void printLogsByDate(ArrayList<Log> logs) {
		
		//날짜입력
		System.out.println("날짜 입력 : ");
		String date = scan.nextLine();
		pirntBar();
		//날짜와 일치하는 출석기록확인
		//학생명(생일) : O
		for(Log log : logs) {
			if(log.getDate().equals(date)) {
				for(StudentLog slog : log.getSlogs()) {
					String name = slog.getStd().getName();
					String birth = slog.getStd().getBirthday();
					System.out.println(name + "(" + birth + ") : " + slog.getState());
				}
			}
		}
		
	}
	
	private static void updateLogs(ArrayList<Log> logs) {
		//날짜를 입력
		System.out.println("날짜 입력 : ");
		String date = scan.nextLine();
		pirntBar();
		
		if(!checkLogDate(logs, date)) {
			pirntStr("해당 일자에 등록된 출석체크가 없습니다.");
			return;
		}
		//이름과 생년 월일을 입력
		System.out.println("이름 입력 : ");
		String name = scan.nextLine();
		System.out.println("생일 입력 : ");
		String birth = scan.nextLine();
		
		//상태를 입력
		System.out.println("상태 입력 : ");
		String state = scan.nextLine();
		pirntBar();
		//입력한 정보와 일치하는 출석정보를 수정
		for(Log log : logs) {
			if(log.getDate().equals(date)) {
				for(StudentLog slog : log.getSlogs()) {
					String tmpName = slog.getStd().getName();
					String tmpBirth = slog.getStd().getBirthday();
					if(tmpName.equals(name) && tmpBirth.equals(birth)) {
						slog.setState(state);
					}
				}
				pirntStr("수정이 완료됐습니다.");
				return;
			}
		}
	}
	
	private static void deleteLogs(ArrayList<Log> logs) {
		//날짜를 입력
		System.out.println("날짜 입력 : ");
		String date = scan.nextLine();
		pirntBar();
		
		if(!checkLogDate(logs, date)) {
			pirntStr("해당 일자에 등록된 출석체크가 없습니다.");
			return;
		}
		for(int i =0; i <logs.size(); i++) {
			if(logs.get(i).getDate().equals(date)) {
				logs.remove(i);
				pirntStr("삭제가 완료됐습니다.");
				return;
			}
		}
	}
	
}



/*	pirntStr("");
	switch(menu) {
	case 1:		break;
	case 2:		break;
	case 3:		break;
	
	default:
		pirntStr("메뉴를 잘못입력했습니다.");
		printStr("잘못된 메뉴입니다.");
		
	}

}
*/