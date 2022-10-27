package day04;

public class NestingForStarEx09 {

	public static void main(String[] args) {
		
		int col, row, count, num = 10;
		for(row = 1; row <= num; row++) {
			for(col = 1; col <= num-row ; col++) {
				System.out.println(" ");
			}
			for(col = 1; col <= row ; col++) {
				System.out.println("*");
			}
			if(num - row > num/2) {
				break;	
					
			}
			
			
		}	
		
			
			
			
	}

}
