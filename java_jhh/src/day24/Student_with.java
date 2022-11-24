package day24;

import lombok.Data;

@Data
public class Student_with {
	private int grade, classNum, num;
	private String name;
	
	public Student_with(int grade, int classNum, int num, String name) {
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
		this.name = name;
	}
	
	public String toString() {
		return grade + "학년 " + classNum + "반 "+ num + "번 "+ name;
	}
	
	
	
}
