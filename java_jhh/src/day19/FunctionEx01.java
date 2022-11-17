package day19;

import java.util.ArrayList;

import lombok.Getter;

public class FunctionEx01 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(1,1,1, "홍길동", 100, 90, 80));
		list.add(new Student(1,1,2, "임꺽정", 90, 90, 80));
		list.add(new Student(1,1,3, "고길동", 10, 90, 20));
		/* 학생들의 국어 성적만 출력하는 코드를 작성하세요.
		 * 
		 * 
		 * 
		 * */
		
		print(list, (a) -> System.out.println(a));
		
		print(list, (a) -> {
			
			System.out.println("국어 : " + a.getKor());
			System.out.println("영어 : " + a.getEng());
			System.out.println("수학 : " + a.getEng());
		
		});
	}
	

}
