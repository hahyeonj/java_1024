package day19;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

@Data
public class PredicateEx01 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(1,1,1, "홍길동", 100, 90, 80));
		list.add(new Student(1,2,1, "임꺽정", 90, 90, 80));
		list.add(new Student(1,1,3, "고길동", 10, 90, 20));
		
		
	
		//print(list, 1, 1);
		//print(list, 1);
		//print(list, (s)->s.getGrade()==1 && s.getClassNum()==1);
		//print(list, (s)->s.getGrade()==1);
		print(list, (s)->s.getName().charAt(0) == '홍');
		
		
		
	}	
	public static void print(ArrayList<Student> list, int grade, int classNum) {
			
		for(Student tmp : list) {
			if(tmp.getGrade() == grade && tmp.getClassNum() == classNum)
				System.out.println(tmp);
		
		}
	}
	
	public static void print(ArrayList<Student> list, int grade) {
		
		for(Student tmp : list) {
			if(tmp.getGrade() == grade)
				System.out.println(tmp);
		
		}
	}
	
	public static void print(ArrayList<Student> list, Predicate<Student> p) {
			
		for(Student tmp : list) {
			if(p.test(tmp)) {
				System.out.println(tmp);
		
			}
		}
	}

	

}
