package day25;

import java.util.Scanner;

public class Ex04_3_s {
	//사용자가 연속 3번 이길때까지 반복(비기거나 지면 다시)

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int count = 0;
		do {
			try {
				
				RPS com = randomRPS();
				System.out.println("컴퓨터 : " + com);
				
				System.out.print("사용자 : ");
				RPS user = RPS.valueOf(scan.next());
				
				State state = resultState(user,com);
				printState(state);
				if(state == state.WIN) {
					count++;
				}else {
					count = 0;
				}
			}catch(IllegalArgumentException e) {
				System.out.println("입력을 잘못했습니다.");
			}
		}while(count != 3);
		System.out.println("게임을 종료합니다.");
		scan.close();
	}

	private static void printState(State state) {
		switch(state) {
		case WIN:
			System.out.println("사용자가 이겼습니다.");
			break;
		case LOSE:
			System.out.println("컴퓨터가 이겼습니다.");
			break;
		default:
			System.out.println("비겼습니다.");
		}
		
	}

	private static State resultState(RPS user, RPS com) {
		if(user == com)
			return State.DRAW;
		switch(user) {
		case 가위:
			return com == RPS.보 ? State.WIN : State.LOSE;
		case 바위:
			return com == RPS.가위 ? State.WIN : State.LOSE;
		default:
			return com == RPS.바위 ?  State.WIN : State.LOSE;
		}
	}

	private static RPS randomRPS() {
		RPS [] rpss = RPS.values();
		int r = (int)(Math.random()*3);
		return rpss[r];
	}
}
