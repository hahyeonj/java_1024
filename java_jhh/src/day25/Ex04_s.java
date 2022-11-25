package day25;
import java.util.Random;
import java.util.Scanner;

public class Ex04_s {
	/* 컴퓨터와 가위, 바위, 보를 하는 프로그램을 작성하세요.
	 * 예
	 * 사용자 : 가위
	 * 컴퓨터 : 보
	 * 사용자가 이겼습니다. 더 하겠습니까? (y/n):
	 * 사용자 : 가위
	 * 컴퓨터 : 주먹
	 * 컴퓨터가 이겼습니다. 더 하겠습니까? (y/n): 
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char ch;
		do {
			int min = 1, max = 3;
			Random r = new Random();
			int com = r.nextInt(max-min) + 1;
						
			System.out.print("가위바위보(번호 입력 1.가위 2.바위 3.보) : ");
			int user = scan.nextInt(); 
			
			if(user == com) {
				System.out.println("비겼습니다. ");
			}
			if(user == com + 1 ) {
			 System.out.println("사용자가 이겼습니다.");
			}
			
			
			
			switch(user) {
			case 1:
				switch(com) {
				case 1:
					System.out.println("비겼습니다.");
					break;
				case 2:
					System.out.println("컴퓨터가 이겼습니다.");
					break;
				default:
					System.out.print("사용자가 이겼습니다.");
				}
				break;
			case 2:
				switch(com) {
				case 1:
					System.out.print("컴퓨터가 이겼습니다.");
					break;
				case 2:
					System.out.print("비겼습니다.");
					break;
				default:
					System.out.print("사용자가 이겼습니다.");
				}
				break;
			case 3:
				switch(com) {
				case 1:
					System.out.print("사용자가 이겼습니다.");
					break;
				case 2:
					System.out.print("컴퓨터가 이겼습니다.");
					break;
				default:
					System.out.print("비겼습니다.");
				}
				break;
			default:
			}
			
			System.out.print("  더 하겠습니까? (y/n)");
			ch = scan.next().charAt(0);
		}while(ch == 'y');
		
		
		
		
	}
}
