package day10;

import java.util.Scanner;

public class UpDownGameManager {
	public static void main(String[] args) {
		/* UpDown게임을 구현하세요.
		 * 1. 플레이
		 * 2. 기록확인
		 * 3. 종료
		 * */
		
		//반복
		int menu;
		Record[] records = new Record[5];
		do { 
			//메뉴 출력
			printMenu();
			//메뉴 선택
			menu = insertInt();
			//메뉴에 따른 기능 실행 : 선택한 메뉴, 기록정보
			runMenu(menu, records);
		}while(menu != 3);	
		
	}
	
	/**
	 * 고정된 메뉴를 출력하는 메소드
	 **/
	public static void printMenu(){
		System.out.println("-------");
		System.out.println("1. 플레이");
		System.out.println("2. 기록확인");
		System.out.println("3. 종료");
		System.out.println("--------");
		System.out.print("메뉴 선택 : ");		
	}
	/**
	 * 콘솔에서 정수를 입력받아 입력받은 정수를 알려주는 메소드
	 * @return 입력받은 정수, 메뉴
	 * 
	 * */
	public static int insertInt() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
	/**
	 * 주어진 기록정보를 이용하여 메뉴에 따른 기능을 실행하는 메소드.
	 * @param records 기록 정보들
	 * @param menu 선택한 메뉴
	 */
	public static void runMenu(int menu, Record[] records) {
		switch(menu) {
		case 1 :
			//플레이를 하고 나면 몇번만에 맞췄는지 알아야 함
			int tryCount = playGame();
			writeRecord(records, tryCount);
			break;
		case 2 :
			//기록확인
			//기록된 순위를 출력
			printRecords(records);
			break;
		case 3 :
			System.out.println("프로그램 종료합니다.");
			break;
		default : 
			System.out.println("잘못된 메뉴입니다.!!");
		}
	}
	private static void printRecords(Record[] records) {
		for(int i = 0; i<records.length; i++) {
			System.out.print(i+1+"위 ");
			if(records != null) {
				records[i].print();
			}
			else {
				System.out.println();
			}
			
		}
		
	}

	/**
	 * 기록 정보보다 사용자 기록이 좋으면 기록을 추가하는 메소드
	 * @param records 기록 정보
	 * @param tryCount 
	 */
	private static void writeRecord(Record[] records, int tryCount) {
		int index = 0;
		for(int i = 0; i<records.length; i++) {
			//1등부터 비교하여 나보다 기록이 좋으면 내 순위가 밀림			
			if(records[i] != null && tryCount > records[i].getCount()) {
				index++;
			}
			//기록이 없는 처음 순위를 내 기록으로 하기 위해 i를 index에 저장
			else if(records[i] == null){
				index = i;
				break;
			}
			//비교 순위보다 내가 기록이 좋으면 반복문 종료
			else {
				index = i;
				break;
			}
		}
		//순위안에 못들으면
		if(index == 5) {
			return;
		}
		System.arraycopy(records, index, records, tryCount+1,
				records.length - index - 1);
		System.out.println("이름 입력(예 : ABC) : ");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		records[index] = new Record(tryCount,null);
	}

	private static int playGame() {
		//랜덤수 생성
		int num = random(1,100);
		int tryCount = 0;
		int user;
		//반복
		do {
			//사용자 입력
			System.out.println("정수 입력 :");
			user = insertInt();
			//Up Down 판별
			if(user > num) {
				System.out.println("DOWN");
			}else if(user < num) {
				System.out.println("UP");
			}else {
				System.out.println("정답");
			}
			tryCount++;
		}while(num != user);
		return tryCount;
	}
	private static int random(int min, int max) {
		return (int)(Math.random()*(max - min + 1) + min);
	}
	
	
		
	/*	int menu;
		Record [] records = new Record [5];
	
		do {
			//메뉴 출력
			BaseballManager.printMenu(
					"------------",
					"메뉴",
					"1. 플레이",
					"2. 기록확인",
					"3. 종료",
					"-------------",
					"메뉴 선택 : "
			);
			//메뉴 선택
			menu = BaseballManager.selectMenu();
			//선택한 메뉴에 따른 기능 실행		
			runMenu(menu,records);
			}while(menu != 3);*/
	
	
	/*
	private static void runMenu(int menu, Record [] records) {
		Scanner scan = new Scanner(System.in);
		int min = 1, max = 50;
		switch(menu) {
			case 1 :
				//컴퓨터가 랜덤으로 숫자 생성
				int com = MethodBaseballGameEx01.random(min, max);
				System.out.println(com);
				System.out.print(min +" - " + max + "사이의 숫자를 입력하시오 : ");
				int user = 0;
				int tryCount = 0;
				do {//사용자가 숫자 입력
					user = scan.nextInt();
					//결과 출력
						if(com > user) {
							System.out.println("Up");
						}else if(com < user){
							System.out.println("Down");
						}
						tryCount++;
				}while(com != user); 
				
				int maxRecordCount = BaseballManager.getMaxRecordCount(records);		
				//기록된 수를 찾음(꼴찌 순위)
				int maxRecordRank = BaseballManager.getMaxRecordRank(records);
				//기록된 최대 횟수가 내 횟수보다 크거나 기록된 수가 5보다 작으면 기록
				if(maxRecordCount > tryCount || maxRecordRank < 5) {
					BaseballManager.addRecord(records, tryCount);
				}
				break;
		case 2 :
			//2. 기록확인
			//등록된 5위까지의 기록을 확인
			BaseballManager.printRecord(records);
			break;
		case 3 :
			System.out.println("종료하겠습니다.");
		default :
	
		}
		scan.close();
	}
	*/
}	
