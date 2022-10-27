package day04;

import java.util.Scanner;

public class ForDivisiorEx01 {

	public static void main(String[] args) {
		/* 정수 num의 약수를 출력하는 코드를 작성하세요.
		 * 약수 : 나누었을 떄 나머지가 0이 되게 하는 수
		 * 6의 약수 : 1,2,3,6
		 * 반복횟수 : i 는 1부터 num까지 1씩 증가
		 * 규칙성 : num를 i로 나누었을 때 나머지가 0과 같다면 i를 출력
		 * 반복문 종료 후 : 없음
		 * */
		/* int i, num; 
		Scanner scan = new Scanner(System.in);
			System.out.print("정수를 입력하세요 : ");
		num = scan.nextInt();
		System.out.println();
		
		*/
		
		int num = 6, i;
		for(i = 1 ; i <= num ; i++) {
			if(num % i == 0 ) {
				System.out.print(i + " ");
			}
		}
	}

}
