package day08;

import java.util.Scanner;

public class MethodBaseballGameEx01 {

	public static void main(String[] args) {
		/* 1~9사이의 중복되지 않은 3개의 숫자가 랜덤으로 생성이 되고, 
		 * 생성된 숫자를 맞추는 게임
		 * 규칙
		 * - 숫자가 같은 자리에 있으면 Strike
		 * - 숫자가 있지만 다른 자리에 있으면 Ball
		 * - 일치하는 숫자가 하나도 없으면 Out
		 * 예시(랜덤 숫자 : 5 9 8)
		 * 입력 : 1 2 3
		 * 0
		 * 입력 : 4 5 6
		 * 1B
		 * 입력 : 7 8 9
		 * 2B
		 * 입력 : 7 9 5
		 * 1S1B
		 * 입력 : 5 9 8
		 * 3S
		 * 게임 종료
		 * */
		/*int min = 1, max = 9;
		int size = 3;
		int [] bbGame = createRandomArray(min, max, size);*/
		/*int [] user = getUser(size);*/

		//1. 랜덤으로 세개의 수를 선택
		//=> createRandomArray
		int min = 1, max = 9, size = 3;
		
		int []com = createRandomArray(min,max,size);
		printArray(com);
			
		Scanner scan = new Scanner(System.in);
		
			
		int strike = 0, ball;
		do {
			//2. 사용자가 숫자를 선택
			System.out.println("입력");
			int []user = scanArray(scan,size);
			
			//3. 판별
			// => 스트라이크를 판별하는 기능을 구현
			// => countLotto를 이용하여
			strike = getStrike(com, user);
			ball = getBall(com, user);
			
			printGame(strike, ball);
			//2~3을 반복 (3S가 될때까지)
		}while(strike < 3);
		
		scan.close();
		
	}
	
	/**
	 * 기능 :  strike와 ball의 개수가 주어지면 콜솔에 결과를 출력하는 메소드
	 * @param strike 스트라이크 개수
	 * @param ball 볼의 개수
	 * 
	 * 
	 * */
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
	
	
	/**
	 * 기능 : 두 배열이 주어지면 같은 번지에 있는 수를 비교하여 일치하는 숫자들이 몇개 있는지 스트라이크
	 * 알려주는 메소드
	 * @param arr1 int[] : 첫번째 정수 배열
	 * @param arr2 int[] : 두번째 정수 배열
	 * @return 같은 번지에서 일치하는 숫자들의 개수
	 */
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
	
	/**
	 * 기능 : 두  배열이 주어지면 같은 번지에 있는 수를 비교하여 일치하는 숫자들이 몇개 있는지 스트라이크
	 * 알려주는 메소드
	 * @param arr1 int[] : 첫번째 정수 배열
	 * @param arr2 int[] : 두번째 정수 배열
	 * @return 같은 숫자들 중에서 번지가 서로 다른 숫자들의 개수
	 * */
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
	public static void printArray(int arr[]) {
		if(arr == null) {
			return;
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	
	public static int countLotto(int []arr1, int [] arr2) {
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
	
	//메소드3
	//기능 : 숫자가 있지만 다른 자리에 있는지 B개수
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

	//판별  
		/*public static int getCount(int countStrike, int countBall, int []user) {
			
			
			
		}*/	
	
	
	
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
	
	
}
