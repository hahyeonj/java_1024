package day05;

public class ArrayEx09 {

	public static void main(String[] args) {
		
		int index[] = new int[5];
		int i, num, k, count = 0;
		for(i = 0; i<index.length; i++) {
			for(num=2; ;num++) {
				for(k=1; k<=num; k++) {
					if(num % k == 0) {
						count++;
					}
					if(count == 2) {
						index[num] = num;
						System.out.print(num + " ");
					}
			}
			
						
			
			}
		
		}	
	}

}
