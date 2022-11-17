package day18;

import java.util.Scanner;

public class EnumEx02 {


	public static void main(String[] args) {
		/* 
		 * 
		 * */
		Scanner scan = new Scanner(System.in);	
		System.out.print("요일 : ");
		String day = scan.next();
		
		switch(day) {
		case "MONDAY":
			System.out.println("월요일");
			break;
		case "TUESDAY":
			System.out.println("화요일");
			break;
		case "WEDNESDAY" :
			System.out.println("수요일");
			break;
		case "THURSDAY":
			System.out.println("목요일");
			break;
		case "FRIDAY":
			System.out.println("금요일");
			break;
		case "SATURDAY":
			System.out.println("토요일");
			break;
		case "SUNDAY":
			System.out.println("일요일");
			break;
		default :
			System.out.println("잘못 입력했습니다.");
		}
		Week week = Week.valueOf(day);
		try {
			switch (week) {
			case MONDAY:
				System.out.println("월요일");
				break;
			case TUESDAY:
				System.out.println("화요일");
				break;
			case WEDNESDAY :
				System.out.println("수요일");
				break;
			case THURSDAY:
				System.out.println("목요일");
				break;
			case FRIDAY:
				System.out.println("금요일");
				break;
			case SATURDAY:
				System.out.println("토요일");
				break;
			case SUNDAY:
				System.out.println("일요일");
				break;
		
			}
		}catch(Exception e) {
			System.out.println("잘못 입력했습니다.");
		}
	}
	
	
}

enum Week{
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}