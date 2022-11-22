package day22;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class AttendanceMain {

	public void main(String[] args) throws ParseException {
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
		Scanner scan = new Scanner(System.in);
		
		ArrayList<StudentList> list = new ArrayList<StudentList>();
		AttendanceService attendanceService =  new AttendanceServiceImp();
		int menu = -1;
		
		do{
			attendanceService.printMenu();
			menu = scan.nextInt();
			attendanceService.runMenu(menu, list);

			
		}while(menu != 9);
		System.out.println("프로그램이 종료되었습니다.");
		scan.close();
	}

}
