package day04;

public class NestingForStarEx02 {

	public static void main(String[] args) {
		/* *
		 * **
		 * ***
		 * ****
		 * *****
		 * */
		
		/*
		int col, row;
		for(row = 1; row <= 5; row++) {
			
			for(col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();*/
			
				/*
				 * 
				 * 
				 * 
				 * 
				 * */
		
		
		int col, row;
		
		for(row=1; row<=5; row++) {
			//공백 출력 5-row개
			for(col=1; col<=5-row ; col++) {
				System.out.print(" ");
			}
			//*출력 row개 
			for(col=1; col<=row ; col++) {
				System.out.print("*");
			}
			//엔터
			System.out.println();	
		}
		/*     *         row=1 공백=4  *=1   *=0
		 *    ** *       row=2 공백=3  *=2   *=1
		 *   *** **      row=3 공백=2
		 *  **** ***
		 * ***** ****   
		 * */
		
		
		
		for(row=1; row<=5; row++) {
			//공백 출력 5-row개
			for(col=1; col<=5-row; col++) {
				System.out.print(" ");
			}
			//*출력 row개 
			for(col=1; col<=row; col++) {
				 System.out.print("*");
			}
			for(col=1; col<=row-1; col++) {
				 System.out.print("*");
			}
			//엔터
			System.out.println();
		}	
			
	}

}
