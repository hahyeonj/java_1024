package day24;

import lombok.Data;

@Data
public class Student {
	private String name;
	private int grade;
	private int classNum;
	private int num;
	
	
	public Student(String name, int grade, int classNum, int num) {
		this.name = name;
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
	}	
	
	public Student(Student std) {
		this.name = std.name;
		this.grade = std.grade;
		this.classNum = std.classNum;
		this.num = std.num;
	}
}
