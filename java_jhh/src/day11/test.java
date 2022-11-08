package day11;
import java.util.Scanner;
public class test {

	
		public void main count() { 
			Scanner sc = new Scanner(System.in);
			

		while(true) {
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();
			if(str == "exit") {
				break;
			}else {
				System.out.println(str.length() + "글자입니다.");
			}
			
			
		}
		System.out.println("프로그램 종료");
	}

}
