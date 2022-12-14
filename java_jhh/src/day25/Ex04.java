package day25;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		do {
			System.out.println("사용자 : ");
			String user = scan.next();
			String com = randomRPS();
			System.out.println("컴퓨터 : " + com);
			int res = compare(user,com);//1. 사용자 승, 0:비김, -1:컴승
			printResult(res);
			System.out.println("더 하시겠습니까? (y/n)");
		}while(!scan.next().equals("n"));
		scan.close();
	}

	private static void printResult(int res) {
		switch(res) {
		case 1:
			System.out.println("사용자가 이겼습니다.");
			break;
		case 2:
			System.out.println("컴퓨터가 이겼습니다.");
			break;
		default:
			System.out.println("비겼습니다.");
		}
	}

	private static String randomRPS() {
		List<String> list = Arrays.asList("가위","바위","보");
		int r = (int)(Math.random()*3);
		return list.get(r);
	}
	private static int compare(String a, String b) {
		//비김을 처리
		if(a.equals(b))
			return 0;
		//a가 이기거나(1) 지거나(-1)
		switch(a) {
		case "가위":
			return b.equals("보") ? 1 : -1;
		case "바위":
			return b.equals("가위") ? 1 : -1;
		default:
			return b.equals("바위") ? 1 : -1;
		}
	}

}
