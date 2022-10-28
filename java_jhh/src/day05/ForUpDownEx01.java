package day05;

import java.util.Scanner;

public class ForUpDownEx01 {

	public static void main(String[] args) {
		/* 랜덤한 수를 생성하여 해당 수를 맞추는 코드를 작성하세요.
		 * */
		
		
		int max = 100, min = 1;
		int num = min-1; 
		int r = (int)(Math.random()*(max - min + 1) + min);
		System.out.println(r);//	
		Scanner scan = new Scanner(System.in);
		for (; r != num ; ) {
			//1. 숫자를 입력하세요 : 안내문구 출력
			System.out.print("1-100까지의 숫자를 입력하세요 : ");
			//2. 정수를 입력받음
			num = scan.nextInt();
			//3. 입력받은 정수가 r과 같으면 정답입니다. 라고 출력하고
			if(num == r) {
				System.out.println("정답입니다.");
			
			}
			//			입력받은 정수가 r보다 크면 DOWN이라고 출력하고
			else if(num > r) {
				System.out.println("DOWN");
				
			}
			//			아니면 UP이라고 출력한다.
			else {
				System.out.println("UP");
			}
			
			
			
		}
		
		
	} 

}
