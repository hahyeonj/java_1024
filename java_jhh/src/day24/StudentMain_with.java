package day24;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class StudentMain_with implements Serializable {
      	/**
	 * 
	 */
	private static final long serialVersionUID = 6549817094569217023L;
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args ) {
		String fileName = "student.txt";
		int menu = -1;
		
		ArrayList<Student_with> list = new ArrayList<Student_with>();
		load(list, fileName);
		do {
			printMenu();
			menu = scan.nextInt();
			printBar();
			runMen(menu, list);
		}while(menu != 3);
		save(list, fileName);
		
	}
	

	private static void printMenu() {
		 System.out.println("1. 학생 추가(이름, 학년, 반, 번호)");
		 System.out.println("2. 학생 출력");
		 System.out.println("3. 종료");
		 printBar();
		 System.out.print("메뉴 선택 : ");
	}
	private static void printStr(String str) {
		System.out.println(str);
		printBar();
	}
	private static void printBar() {
		System.out.println("==================");
	}
	
	private static void runMen(int menu, ArrayList<Student_with> list) {
		switch(menu) {
		case 1:
			addStudent(list);
			break;
		case 2:
			printStudent(list);
			break;
		case 3:
			printStr("프로그램 종료!");
			break;
		default:
		
		
		}
	}

	private static void addStudent(ArrayList<Student_with> list) {
		if(list == null)
			throw new RuntimeException("예외 발생 : 학생을 관리할 리스트가 생성되지 않았습니다.");
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("학년 : ");
		int grade = scan.nextInt();
		System.out.print("반 : ");
		int classNum = scan.nextInt();
		System.out.print("번호 : ");
		int num =  scan.nextInt();
		//입력받은 학생정보를 이용하여 학생 객체를 생성
		Student_with std = new Student_with( grade, classNum, num, name);
		list.add(std);
		printStr("학생 추가가 완료됐습니다.");	
		}
	private static void printStudent(ArrayList<Student_with> list) {
		if(list.size() == 0) {
			printStr("학생 정보가 없습니다.");
			return;
		}
		for(Student_with std : list) {
			System.out.println(std);
		}
		printBar();
	}
	
	private static void save(ArrayList<Student_with> list, String fileName) {
		if(list == null)
			throw new RuntimeException("예외 발생 : 학생을 관리할 리스트가 저장되지 않았습니다.");
		
		try (ObjectOutputStream oos
				= new ObjectOutputStream(new FileOutputStream(fileName))){
			for(Student_with std : list) {
				oos.writeObject(std);
			}
			printStr("저장했습니다.");
		}catch(FileNotFoundException e) {
			printStr(fileName + "을 생성할 수 없어서 저장에 실패했습니다.");
		}catch(IOException e) {
			printStr("저장에 실패했습니다.");
		}
		
	}
	
	private static void load(ArrayList<Student_with> list, String fileName) {
		if(list == null)
			throw new RuntimeException("예외 발생 : 학생을 관리할 리스트가 저장되지 않았습니다.");
		
		try (ObjectInputStream ois
				= new ObjectInputStream(new FileInputStream(fileName))){
			while(true) {
				Student_with std = (Student_with)ois.readObject();
				list.add(std);
			}
		}catch(FileNotFoundException e) {
			printStr(fileName + "이 없어서 불러오기에 실패했습니다.");
		
		}catch(EOFException e) {
			printStr("불러오기 완료.");
		}catch(Exception e) {
			printStr("불러오기에 실패.");
	}
}
