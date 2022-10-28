package day05;

import java.util.Scanner;

public class DoWhileEx09 {

	public static void main(String[] args) {
		int max = 100, min = 1;
		int i, r, num;
		char ch;
		Scanner scan = new Scanner(System.in);
		do {
			r = (int)(Math.random()*(max - min + 1) + min);
			System.out.print(min + " ~ " + max + "사이의 수를 입력하세요 : ");
			num = nextInt();
			
			if(r == num) {
				
				
			}
				
			
				
		}while(r == num);
	}

}
