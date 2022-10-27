package day03;

public class ForEx09 {

	public static void main(String[] args) {
	
		int i, k ;
		System.out.println("구구단");
		for( i = 2  ; i <= 9; i++) {
			System.out.println();
			System.out.println( i + "단");
			
			for(k = 1; k <= 9; k++) {
				System.out.println( i +" * "+ k + " = " + (i * k) );
			}
		}
	}

}
