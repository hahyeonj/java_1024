package day02;

public class OperatorEx03 {

	public static void main(String[] args) {
		/* 산술연산자  : + - * / %
		 * 정수 산술연산자 정수 => 정수 => / 를 할때 결과값이 다르게 나올 수 있으니 항상 확인 필요
		 * 실수 산술연산자 정수 => 실수
		 * 정수 산술연산자 실수 => 실수
		 * 실수 산술연산자 실수 => 실수
		 * */
		int num1 = 1, num2 = 2;
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " / " + num2 + " = " + ((double)num1 / num2));
		System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
		
				
	}

}
