package day04;

import java.util.Scanner;

public class ForGcEx01 {

	public static void main(String[] args) {
		/* 두 정수의 최대 공약수를 구하는 코드를 작성하세요.
		 * 약수 : 나누었을 떄 나머지가 0이 되게 하는 수
		 * 공약수 : 두 정수의 약수들 중에서 공통으로 있는 약수
		 * 최대공약수 : 두 정수의 약수들 중에서 가장 큰 공약수
		 * 12 : 1 2 3 4 6 12
		 * 18 : 1 2 3 6 9 18
		 * 12와 18의 공약수 : 1 2 3 6
		 * 12와 18의 최대 공약수 : 6
		 * */
		int gcd = 1, i = 1, num1, num2 ;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 2개를 입력하세요 : ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		
/*		for(int i = num1; i > 0; i--) {
			if(num1 % i == 0 && num2 % i == 0) {
				System.out.println(num1 + ", "+ num2+ "의 최대공약수는 " + i);
				break;
				
			}
		}*/
		for(i = 1; i <= num1; i++){
			//i가 num1과 num2의 공약수이면
			//=>i가 num1의 약수이고 i가 num2의 약수이다
			if(num1 % i == 0 && num2 % i == 0){
				gcd = i;
	 		}	
		 }
		 System.out.println("최대공약수는 " + gcd);
	
	}
}
