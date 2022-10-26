package day03;

import java.util.Scanner;

public class IfEx08 {

	public static void main(String[] args) {
		/* 점수를 정수로 입력받아 입력받은 성적에 맞는 학점을 출력하는 코드를 작성하세요.
		 * A : 90 ~ 100
		 * B : 80 ~ 89
		 * C : 70 ~ 79
		 * D : 60 ~ 69
		 * F : 0 ~ 59
		 * 잘못된 성적 :  그 외
		 * */
		//정수를 입력받아 score에 저장
		Scanner scan = new Scanner(System.in);
		System.out.print("성적을 입력하세요 : ");
		int score = scan.nextInt();
		
		if(100 >= score && score >= 90) {
			System.out.println(score + "점은 A학점");
		}
		else if(89 >= score && score >= 80) {
			System.out.println(score + "점은 B학점");	
		}
		else if(79 >= score && score >= 70) {
			System.out.println(score + "점은 C학점");	
		}
		else if(69 >= score && score >= 60) {
			System.out.println(score + "점은 D학점");	
		}
		else if(59 >= score && score >= 0) {
			System.out.println(score + "점은 F학점");	
		}
		else {
			System.out.println(score + "점은 잘못된 성적입니다.");
		}
		
		/*if(score > 100 || score < 0) {
				System.out.println(score + "점은 잘못된 성적입니다.");
		 * else if(score >= 90) {
		 * 		System.out.println(score + "점은 A학점");
		 * }else if(score >= 80) {
		 * 		System.out.println(score + "점은 B학점");
		 * }else if(score >= 70) {
		 * 		System.out.println(score + "점은 C학점");
		 * }else if(score >= 60) {
		 * 		System.out.println(score + "점은 D학점");
		 * }else {
		 *		System.out.println(score + "점은 F학점");	
		 * }
		 * */
		scan.close();
	
	}

}

