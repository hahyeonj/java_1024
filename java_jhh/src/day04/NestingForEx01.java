package day04;

public class NestingForEx01 {

	public static void main(String[] args) {
		/* 구구단 3단을 출력하는 코드를 작성하세요.
		 * 		 * 
		 * */
		int num = 3, i;
			for(num = 2; num <= 9; num++) {
				System.out.println(num + "단");
				for (i = 1; i <= 9; i++) {
					System.out.println(num + " x " + i + " = " + num*i);
				}
				System.out.println();
			}
		/*
		int i, k;
		System.out.println("구구단");
		for(i = 2; i <= 9; i++ ) {
			System.out.println(i + "단");
			for(k = 1; k <= 9; k++) {
				System.out.println(i + " x " + k + " = " + (i*k));
			}
			System.out.println();
		}
*/
		
		
	}

}
