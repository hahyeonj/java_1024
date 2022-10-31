package day06;

import java.util.Scanner;

public class ArrayUpDownEx01 {

	public static void main(String[] args) {
		/* Up Down 게임을 무조건 3번 반복해서 맞춘 3번의 횟수를 배열에 저장하여 출력하는
		 * 코드를 작성하세요
		 * */
		int	coin = 3;
		int record[] = new int[coin];
		int count = 0;
		int min = 1, max = 9;//랜덤 수 범위
		Scanner scan = new Scanner(System.in);
		int num, r;
		
		/*while(coin->0){
		 * 	int r = (int)(Math.random()*(max -min +1 ) +min);
		 *  System.out.print(min + "~" + max + " 사이의 랜덤한 수 :
		 *  int num;
		 *  int tryCount = 0;
		 *  do { 
		 *  	System.out.print(min + "~" + max + " 사이의 랜덤한 수 : ");
		 *  	int num;
		 *  	do{	
		 *  		tryCount++;
		 *  		System.out.print("숫자 입력 ");
		 *  		num = scan.nextInt();
		 *  	    if(num == r) {
					System.out.println(i+1 + "번째 게임 " + count + "번 만에 정답입니다.");
					}
					else if(num > r) {
					System.out.println("DOWN");
					record[record.length - coin -1]	= tryCount;	
					}
					else {
					System.out.println("UP");
					}
		 *  	    
		 *  
		 * */
		
		
		
			
		for (int i=0; i < 3 ; i++) {
			r = (int)(Math.random()*(max - min + 1) + min);
			num = min - 1;
			System.out.println(r);
			for(count = 1; r!= num; count++) {	
				System.out.print(i+1 + "번째 게임 - ");
				System.out.print(min + "~" + max + " 사이의 랜덤한 수 : ");
				num = scan.nextInt();
				if(num == r) {
					System.out.println(i+1 + "번째 게임 " + count + "번 만에 정답입니다.");
					record[i]=count;
				}
				else if(num > r) {
					System.out.println("DOWN");		
				}
				else {
					System.out.println("UP");
				}
			
			}
			
		}
		for(int tmp : record) {
			System.out.print(tmp + " ");
		}
	scan.close();
	}

}
