package day20;

import java.util.ArrayList;
import java.util.Scanner;

import example.accountbook.AccountService;
import example.accountbook.AccountServiceImp;

public class PhoneListMain {

	static Scanner scan = new Scanner(System.in);
	private static PhoneListServiceImp PhoneListService; 	
	public static void main(String[] args) {
		/* 전화번호를 관리하는 프로그램을 작성하세요.
		 * 1. 전화번호 추가(성, 이름, 직장, 전화번호들)
		 * 2. 전화번호 수정
		 * 	- 이름으로 검색(성+이름)
		 *  - 검색된 사람들 중에서 선택
		 *  - 성 이름을 수정할건지
		 *  - 기존 등록된 전화번호를 수정할건지,
		 *  - 새 전화번호를 등록할건지를 선택하여 동작
		 * 3. 전화번호 삭제
		 * 	- 이름으로 검색(성+이름)
		 * 	- 검색된 사람들 중에서 선택
		 *  - 선택된 사람의 연락처를 선택
		 * 4. 전화번호 조회
		 * 	- 이름으로 검색
		 *  - 검색된 사람들 중에서 선택
		 *  - 선택된 사람의 연락처를 출력
		 * */
		
		//반복
		//메뉴 출력
		
		//메뉴 선택
			//1. 번호 추가
				//성명, 직장 입력
					
				//반복
					//전화번호를 입력(이름 : 번호) => PhoneNumber
						
					//전화번호를 더 입력할건지 물어봄
		
				//주소록에 추가 => PhonBook 개체를 생성
			//2. 번호 수정
				//이름을 입력
				
				//이름이 포함된 전화번호부를 검색하여 출력(번호와 함께)
		
				//수정할 전화번호부를 선택
		
				//서브 메뉴 출력
				//1. 이름, 직장 수정
					//이름, 직장 입력
		
					//이름, 직장을 수정
		
				//2. 기존 전화번호 수정
					//기존 전화번호들을 출력
		
					//수정할 전화번호를 선택
		
					//이름 번호를 입력
		
					//선택한 전화번호 이름, 번호를 수정
		
				//3. 새 전화번호 추가
					//이름 번호 입력
		
					//새 전화번호를 추가
		
		
			//3. 번호 삭제
				//이름을 입력
		
				//이름이 포함된 전화번호부를 검색하여 출력(번호와 함께)

				//삭제할 전화번호부를 선택
				
				//전화번호 조회
			//4. 번호 삭제
				//이름을 입력
		
				//이름이 포함된 전화번호부를 검색하여 출력(번호와 함께)
		
				//조회할 전화번호부를 선택
				
				//전화번호 조회
			//5. 프로그램 종료
			
		
		int menu;
		PhoneListService phoneListService = new PhoneListServiceImp();
		ArrayList<PhoneBook> List = new ArrayList<PhoneBook>();
		ArrayList<PhoneNumber> List = new ArrayList<PhoneNumber>();
		
		String lastName, firstName, fullName, job;
		int PhoneNumber;
		
		//메뉴를 출력함.
		printMenu();
		
		//메뉴를 입력받음
		menu = scan.nextInt();
		
		switch(menu) {
		//1. 전화번호 추가(성, 이름, 직장, 전화번호들)
		insertPhoneNumber(list);
		case 1:
			System.out.println("================");
			System.out.println("성 : ");
			String lastName= scan.nextLine();
			System.out.println("이름 : ");
			String Name= scan.nextLine();
			System.out.println("직장 : ");
			String job = scan.nextLine();
			System.out.println("전화번호");
			= scan.nextLine("");
			
			
			//
			
			list.add();
			break;
		// 2. 전화번호 수정
		case 2:
			updateRecord();
			System.out.println();
			
			// 	- 이름으로 검색(성+이름)
			
			System.out.println("이름 : ");
			String fullName= scan.nextLine();
			
			//  - 검색된 사람들 중에서 선택
			
			switch() {
			//  - 성+이름을 수정할건지
			case 1:
				break;
			//  - 기존 등록된 전화번호를 수정할건지,
			case 2:
				break;
			//  - 새 전화번호를 등록할건지를 선택하여 동작
			
			
			}
			break;
		// 3. 전화번호 삭제
		case 3:
			deletePhoneNumber();
		
		// 	- 이름으로 검색(성+이름)
			searchPhoneNumber();
		// 	- 검색된 사람들 중에서 선택
			
		//  - 선택된 사람의 연락처를 선택
			
			break;
		case 4:
			
		// 4. 전화번호 조회
		// 	- 이름으로 검색
		//  - 검색된 사람들 중에서 선택
		//  - 선택된 사람의 연락처를 출력
			break;
		case 5: 
			System.out.println("프로그램을 종료합니다.");
			break;
		default:
			System.out.println("잘못된 메뉴 입니다.");
		}while(menu != 5);
	}

}
