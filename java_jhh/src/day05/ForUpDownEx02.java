package day05;

import java.util.Scanner;

public class ForUpDownEx02 {

	public static void main(String[] args) {
		int max = 100, min = 1;
		int r, num;
		Scanner scan = new Scanner(System.in);
		char charAt='0';
		for (; ; ) {
			r = (int)(Math.random()*(max - min + 1) + min);
			num = min - 1;
			
			for( ;r != num && charAt == 'n' ; ) {	
				//1. 숫자를 입력하세요 : 안내문구 출력
				System.out.print(min + "~" + max + " 사이의 랜덤한 수를 입력하세요 : ");
				//2. 정수를 입력받음
				num = scan.nextInt();
				
				//3. 입력받은 정수가 r과 같으면 정답입니다. 라고 출력하고
				if(num == r) {
					System.out.println("정답입니다.");
					System.out.print("더 하시겠습니까?(y/n) : ");
					if(scan.next().charAt(0) == 'n') {
						break;
					}
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
			System.out.println("프로그램을 종료합니다.");
			
		}
	
	}

}
