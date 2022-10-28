package day05;

public class WhileEx01 {

	public static void main(String[] args) {
		/* while문 문법
		 * 
		 * while(조건식){
		 * 		실행문;
		 * }
		 * 
		 * 초기화;
		 * while(조건식){
		 * 		실행문;
		 * 		증감식;//실행문을 for문에 비교하기 위해서 실행문, 증감식으로 나눈것 원래는 증감식 없음.
		 * }
		 * continue는 while문에서 조건식
		 * */
		int i = 1;
		i = 1;
		while(i<= 5) {
			System.out.println("Hello world!");
			i++;
		} 
		/* while문에서는 조건식을 생략할 수 없다.
		 * while문에서 무한루프를 만들렴녀 조건식에 true를 넣어주면 된다.
		 * */
		
		
	}

}
