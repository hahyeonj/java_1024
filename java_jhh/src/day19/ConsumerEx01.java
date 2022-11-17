package day19;

import java.util.ArrayList;
import java.util.function.Function;

public class ConsumerEx01 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(1, 1, 1, "홍길동"));
		list.add(new Student(1, 1, 1, "홍길동"));
		list.add(new Student(1, 1, 1, "홍길동"));
		
		//printKor(list);
		//printEng(list);
		//printMath(list);
		
		print(list, "국어", s->s.getKor());
		print(list, "영어", s->s.getEng());
		print(list, "수학", s->s.getMath());
		print(list, "총합", s->s.getKor()+s.getKor()+s.getMath());
		
		
	}
		
	public static void print(ArrayList<Student> list, String subject, Function<Student, Integer>f) {
		
		for(Student tmp : list) {
			System.out.println(subject + " : " + f.apply(tmp));
		}
	}
	
	
	
	public static void printKor(ArrayList<Student> list) {
		for(Student tmp : list) {
			System.out.println("국어 : " + tmp.getKor());
		}
	}
	
	public static void printEng(ArrayList<Student> list) {
		for(Student tmp : list) {
			System.out.println("영어 : " + tmp.getKor());
		}
	}
	
	
	public static void printMath(ArrayList<Student> list) {
		for(Student tmp : list) {
			System.out.println("수학 : " + tmp.getKor());
		}
	}
		
		
		
		/*
		print(list, (a) -> System.out.println(a));
		
		print(list, (a) -> {
			System.out.println("-------------------------");
			System.out.println("학년 : " + a.getGrade());
			System.out.println("반 : " + a.getClassNum());
			System.out.println("번호 : " + a.getNum());
			System.out.println("이름 : " + a.getName());
			System.out.println("-------------------------");
		});
	}

	*//*
	public static void print(ArrayList<Student> list, Consumer<Student> con) {
		for(Student tmp : list) {
			con.accept(tmp);
		}
	}*/
}
