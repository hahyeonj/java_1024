package day06;

import java.util.Scanner;

public class ArrayLottoEx01 {

	public static void main(String[] args) {
		
		/* 로또 번호를 랜덤으로 생성하고, 당첨 번호를 입력하여 몇등 당첨됐는지 출력하는 
		 * 코드를 작성하세요
		 * 숫자 범위 : 1~45
		 * 1등 : 6개
		 * 2등 : 5개 + 보너스 번호
		 * 3등 : 5개
		 * 4등 : 4개
		 * 5등 : 3개
		 * 로또 번호 : 번호 6개와 + 보너스번호
		 */
		
		
		int size = 7;
		int lotto[] = new int[size];//랜덤 수를 저장할 배열
		int count = 0;//저장된 랜덤 수의 개수
		int min = 1, max = 45;//랜덤 수 범위
		int r;
		int bonus;
		
		
		while(count < size) {
			r = (int)(Math.random()*(max - min +1) + min);
			boolean isDuplicated = false; 
			for(int i = 0; i < count; i++) {
				if(lotto[i] == r) {
					isDuplicated = true; 
				}
			}
			if(isDuplicated) {
				continue;
			}
			lotto[count++] = r; 	
		}
		for(int tmp1 : lotto) {
			System.out.print(tmp1 + " ");
		}
		
		/*보너스 번호를 랜덤으로 생성(위에서 생성한 번호와 중복되지 않게)
		 int bonus;
		 while(true){
		 		r = (int)(Math.random()*(max - min +1) + min);
	 			for(int i = 0; i < lotto.length; i++) {
					if(lotto[i] == r) {
					isDuplicated = true; 
				}
			}
		
			if(isDuplicated) {
				continue;
		 }
   		 bonus = r;
		  break;
		 */
		
		
		//당첨 번호 6개를 입력받음
		Scanner scan = new Scanner(System.in);
		int user[] = new int[size];
		for(int i = 0; i<user.length-1; i++) {
			user[i] = scan.nextInt();
			System.out.print(i+"번째 번호를 입력하세요 : ");
		}
		System.out.println("보너스 번호를 입력하세요 : ");
		bonus = scan.nextInt();
		
		//일치하는 번호 개수를 구함
		int sameCount = 0;
		

		for(int j = 0; j <= user.length - 1; j++) {
			for(int i = 0; i <= lotto.length; i++) {
				if(user[j] == lotto[i]) {
					sameCount++;
				}
			}
		}
		
		
		

		//등수 판별
		switch(sameCount) {
		case 6:
		System.out.println("당신은 1등입니다.");
		break;
		case 5:
			if(lotto[7] == bonus) {	
				System.out.println("당신은 2등입니다.");
			}
			
			else {
				System.out.println("당신은 3등입니다.");}
			break;
			/* boolean isDuplicated = false;
			 * for(int i = 0; i < user.length; i++ 
			 * 	if(user[i] == bonus){
			 * 		isDuplicated = true
			 * }
			 * if(isDuplicated){
			 * sysout("2등") 
			 * }else{
			 	 "3등" 
			 * }
			 * 
			 * 
			 * */

		case 4:
			System.out.println("당신은 4등입니다.");
			break;
		case 3 :
			System.out.println("당신은 5등입니다.");
			break;
		default:
			System.out.println("낙첨되었습니다.");
		}
		
		
		
		
	scan.close();
		
	}

}
