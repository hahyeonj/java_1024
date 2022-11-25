package day25;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = scan.nextInt();
		int sum = 0;
		String str = "합";
		if(num >= 0) {
			//누적 합
			for(int i = 0; i<=num; i++)
				sum += i;
		}else {
			//누적 차
			str = "차";
			for(int i = 0; i>=num; i--)
			sum -= i;
		}
		System.out.println("0부터 " + num + "까지 " + str +" : " + sum);
		scan.close();
	}

}
