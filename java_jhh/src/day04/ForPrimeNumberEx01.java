package day04;

import java.util.Scanner;

public class ForPrimeNumberEx01 {

	public static void main(String[] args) {
		/* 정수 num가 소수인지 아닌지 판별하는 코드를 작성하세요.
		 * 소수는 약수가 1과 자기 자신뿐인 수
		 * */
		int i, num, count = 0; 
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		num = scan.nextInt();
		System.out.println();

		for(i = 1; i <= num ; i++) {
			if(num % i == 0){
				count++; //++count; //count = count + 1; //count += 1;
					}
		}
		
		if(count == 2) {
			System.out.println(num + "는 소수");
		}
		else {
			System.out.println(num + "는 소수가 아님");
		}
	}

}
