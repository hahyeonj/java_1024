package day09;

import java.util.Scanner;

import day10.BaseballGame;

public class BaseballManagerSelf {

	public static void main(String[] args) {
		/* 숫자 야구게임을 플레이 한 후, 기록을 저장하는 프로그램을 작성하세요.
		 * 메뉴
		 * 1. 플레이
		 * 2. 기록확인
		 * 3. 종료
		 * 메뉴선택 : 2
		 * 1. 홍길동 2회
		 * 2. 임꺽정 3회
		 * 3. 이몽룡 3회
		 * 4. 춘향이 4회
		 * */
		

		
		int menu;
		int min = 1, max = 9, size = 3;
		int count = 0;
		//메뉴 출력
		do {printMenu();
			//메뉴 선택
			menu = selectMenu();
			//선택한 메뉴에 따른 기능 실행
			switch (menu) {
			
			case 1 : playGame();
					int []com = createRandomArray(1, 9, 3);
					BaseballGame bg = new BaseballGame(com);
					do {
						
						
						
						
						
					}while(true);
			case 2 : printRecord();
			case 3 : System.out.println("프로그램을 종료합니다.!!");
			break;
			}
			return;
		}while(menu != 3);
		
		
		
	
	}
	

	/**
	 * 주어진 메뉴에 맞는 기능을 실행하는 메소드
	 * @param menu 실행할 메뉴 번호
	 */
	
	private static void runMenum(int menu) {
		//1.플레이
		//2.기록확인
		//3.종료
		
		switch(menu) {
		case 1 : 
			//컴퓨터가 랜덤으로 숫자 생성
			
			//사용자가 숫자 입력
			
			//판별
			
			//3S종료
			break;
		case 2 :
			break;
		case 3 :
			break;
		default;

		}
	}
	/**
	 * 메뉴를 콘솔에서 입력받아 돌려주는 메소드
	 * @return 입력받은 메소드
	 * 
	 * */
	private static int selectMenu() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
	
	
	
	/**
	 * 메뉴를 출력하는 메소드로, 마지막 메뉴는 엔터를 안침
	 * @param strs 콘솔에 출력할 메뉴들
	 */
	private static void printMenu(String ...strs) {
		
		for(int i = 0; i<strs.length; i++) {
			/*
			System.out.println(strs[i]);
			if(i != strs.length-1) {
				System.out.println();
			}*/
			System.out.println(strs[i] + (i!= strs.length-1?"\n":""));
		}
		
		
	}
	
	
}
		
		
		
		
		
		
		
		
		
		
		
		/*int menu;
		int min = 1, max = 9, size = 3;
		int count = 0;
		//메뉴 출력
		do {printMenu();
			//메뉴 선택
			menu = selectMenu();
			//선택한 메뉴에 따른 기능 실행
			switch (menu) {
			case 1 : playGame();
						
			case 2 : printRecord();
			case 3 : System.out.println("프로그램을 종료합니다.!!");
			break;
			}
			return;
		}while(menu != 3);
		
		
		
	
	}
	
	
	
	
	
	//arr[i]record(string userNam, int userRecord);

	

	//2. 기록확인
		//등록된 5위까지의 기록을 확인
	public static void printRecord() {
		
		System.out.println(record);
	}
	
	//[new] 회수를 기록(최대 5등)	, 5등 기준으로 회수가 동일한 경우 먼저 플레이한 사용자 기록을 유지
	public static void writeRecord(){
		
		
		
	}
	
	
	public static void playGame() {
		Scanner scan = new Scanner(System.in);
		int []com = createRandomArray(min,max,size);
		printArray(com);
		//사용자가 숫자 입력
		int strike = 0, ball;
		do {
			//2. 사용자가 숫자를 선택
			System.out.println("입력");
			int []user = scanArray(scan,size);
			
		//판별
			strike = getStrike(com, user);
			ball = getBall(com, user);
			printGame(strike, ball);
		}while(strike < 3);
		
	}
	
	*/
	/**
	메뉴
	 * 1. 플레이
	 * 2. 기록확인
	 * 3. 종료
	*/
	/*	
	public static void printMenu() {
		System.out.println("------메뉴-----");
		System.out.println("1. 플레이");
		System.out.println("2. 기록확인");
		System.out.println("3. 프로그램 종료");
		System.out.print("메뉴를 선택하세요 : ");
	}
	*/
	
	 /** 메뉴선택 : 2*/
		/*
	public static int selectMenu() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
	*/

	
	/**
	 * 기능 :  strike와 ball의 개수가 주어지면 콘솔에 결과를 출력하는 메소드
	 * @param strike 스트라이크 개수
	 * @param ball 볼의 개수
	 * 
	 * 
	 * */
	/*
	public static void printGame(int strike, int ball) {
		if(strike != 0) {
			System.out.print(strike+"S ");
		}
		if(ball != 0) {
			System.out.println(ball + "B");
		}
		if(strike ==0 && ball ==  0) {
			System.out.print("OUT");
		}	
		System.out.println();
	}
	*/
	
	/**
	 * 기능 : 두 배열이 주어지면 같은 번지에 있는 수를 비교하여 일치하는 숫자들이 몇개 있는지 스트라이크
	 * 알려주는 메소드
	 * @param arr1 int[] : 첫번째 정수 배열
	 * @param arr2 int[] : 두번째 정수 배열
	 * @return 같은 번지에서 일치하는 숫자들의 개수
	 */
	/*
		public static int getStrike(int []arr1, int arr2[]) {
		if(arr1 == null || arr2== null) {
			return 0;
		}
		int size = arr1.length < arr2.length ? arr1.length : arr2.length;
		int strike = 0;
		for(int i = 0; i<size; i++) {
			if(arr1[i] == arr2[i]) {
				strike++;
			}
		}
		return strike;
	}
	*/
	/**
	 * 기능 : 두  배열이 주어지면 같은 번지에 있는 수를 비교하여 일치하는 숫자들이 몇개 있는지 스트라이크
	 * 알려주는 메소드
	 * @param arr1 int[] : 첫번째 정수 배열
	 * @param arr2 int[] : 두번째 정수 배열
	 * @return 같은 숫자들 중에서 번지가 서로 다른 숫자들의 개수
	 * */
		/*
	public static int getBall(int []arr1, int []arr2) {
		if(arr1 == null || arr2== null) {
			return 0;
		}
		int ball = 0;
		int strike = getStrike(arr1,arr2);
		for(int num : arr1) {
			if (contains(arr2, num)) {
				ball++;
			}
		}
		
		return ball-strike;
	}
	*/
	
	/** 기능 : Scanner가 주어지면 정수를 size개 만큼 입력받아 배열에 저장하고,
	 * 		저장된 배열을 돌려주는 메소드
	 * 매개변수 : Scanner, size개=> Scanner scan, int size
	 * 리턴타입 : 정수 배열 => int []
	 * 메소드명 : scanArray
	 * @param scan Scanner
	 * @param size 입력받을 정수의 개수
	 * @return 입력받은 값들이 저장된 배열
	 * 
	 * */
		/*
		
	public static int [] scanArray(Scanner scan, int size) {
			if(size <= 0) {
				return null;
			}
			int [] arr = new int[size];
			for(int i=0; i < size; i++) {
				arr[i] = scan.nextInt();
			}
			return arr;
	}
	*/
	//메소드1
	//기능: user에게 입력받는 method
	/*public static int [] getUser(int size){
		System.out.println("입력 번호 : ");
		Scanner scan = new Scanner(System.in);
		int arr[]  = new int [size];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		return arr;
	}
	*/
	/*
	public static void printArray(int arr[]) {
		if(arr == null) {
			return;
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	*/
	/*
	public static int count(int []arr1, int [] arr2) {
		if(arr1 == null ||  arr2==null) {
			return 0;
		}
		int count = 0;
		for(int tmp : arr1) {
				if(contains(arr2,tmp)) {
					count++;
			}
		}
		return count;
	}
	
	*/
		
	/*
	//메소드2
	//기능 : 숫자가 같은 자리에 있는 S개수 
	public static int countStrike(int []arr1, int [] arr2, int size) {
		int arr[]  = new int [size];	
		int countStrike = 0;
		for(int i=0; i < arr.length; i++) {
			if(arr1[i] == arr2[2]) {
					countStrike++;
			}
		}
		return countStrike;
	}
	
	*/
		/*
	public static int countBall(int [] arr1, int []getUser, int size) {
		int countBall = 0;
		int arr[]  = new int [size];
		for(int i = 0; i<arr.length; i++) {
			if (!contains(arr, getUser[i])) {
				arr[i] = getUser[i];
				countBall++;
			}
		}	
		return countBall;
	}
*/
	//판별  
		/*public static int getCount(int countStrike, int countBall, int []user) {
			
			
			
		}*/	
	
	
	/*
	//메소드7
	//기능 : 
	public static int [] createRandomArray(int min, int max, int size) {
		if(max - min + 1 <= size) {
			return null;
		}
		int arr[] = new int[size];

		for(int i = 0; i<arr.length; i++) {
			int r = random(min, max);
			if (!contains(arr, r)) {
				arr[i] = r;
				i++;
			}
		}	
		return arr;
	}
	public static int random(int min, int max) {
		if(min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		return (int)(Math.random()*(max - min + 1) + min);
	}
	
	public static boolean contains(int []arr, int num) {
		if(arr == null || arr.length == 0) {
			return false;
		}
		for(int tmp : arr) {
			if(num == tmp) {
				return true;
			}
		}
		return false;
	}
	
	
}*/
