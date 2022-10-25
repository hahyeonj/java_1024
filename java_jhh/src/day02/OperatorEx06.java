package day02;

public class OperatorEx06 {

	public static void main(String[] args) {
		/* 논리연산자
		 * && : 둘 다 참이면 참, 나머직, 거짓
		 * 		~이고, ~라고
		 * || : 둘 다 거짓이면 거짓, 나머진 참
		 * 		~이거나, 
		 * ! : 반대, ~가 아닌
		 * */
		int score = 85;
		
		//score가 80점 이상이고 score가 90점 미만인가?
		boolean isB = score >= 80 && score < 90;
				
		System.out.println(score + "점은 B학점인가? " + isB);
		
		
		
	}

}
