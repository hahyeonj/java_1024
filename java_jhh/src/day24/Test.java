package day24;

import java.util.Scanner;

public class Test {
	public void sum() {
		Scanner scan =new Scanner(System.in);
		
		int num = -1;
		do{
			System.out.println("1 이상의 숫자 입력하세요");
			num = scan.nextInt();
			
			int sum = 0;
			if(num >= 0) {	
				int i = 1;
				while(i <= num) {
					sum += i;
				}
				System.out.println(num +" 가지의 합은 "+ sum);
			} else {
				System.out.println("숫자가 1이상이 아닙니다.");
			}
		}while(num < 0);
	}
}
