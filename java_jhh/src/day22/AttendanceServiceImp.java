package day22;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class AttendanceServiceImp implements AttendanceService {
	Scanner scan = new Scanner(System.in);
	
	@Override
	public void printMenu() {
		System.out.println("===========메뉴=========");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.print("메뉴 선택 : ");
	
	}

	@Override
	public void runMenu(int menu, ArrayList<StudentList> list) throws ParseException {
		switch(menu) {
		case 1:
			insertStudent(list, inputStudentList(scan));
			break;
		case 2:
			updateStudent(list);
			break;
		case 3:
			deleteStudent(list);
			break;
		case 4:
			studentAttendance();
			break;
		case 5:
			
			break;
		case 6:
					
			break;
		case 7:
			
			break;
		
		case 8:
			
			break;
		case 9:
			
			break;
		default:
		
		}
		
	}

	@Override
	public void insertStudent(ArrayList<StudentList> list, StudentList studenList) {
		list.add(studenList);
		Collections.sort(list,new Comparator<StudentList>() {
			@Override
			public int compare(StudentList o1, StudentList o2) {
				if(o1 == null)
					return 1;
				if(o2 == null)
					return -1;
				//if(!o1.getStdName().equals(o2.getStdName()))
				return o1.getStdName().compareTo(o2.getStdName());
			}
		});
	}
	
	@Override
	public StudentList inputStudentList(Scanner scan) 
		throws ParseException {
		scan.nextLine();
		System.out.print("성명 : ");
		String stdName = scan.nextLine();
		System.out.print("생년월일(2022-11-22) : ");
		String birthday = scan.next();
		return new StudentList(stdName, birthday);
	}
	
	
	@Override
	public boolean updateStudent(ArrayList<StudentList> list) {
		return false;
	}

	@Override
	public boolean deleteStudent(ArrayList<StudentList> list) {
		// TODO Auto-generated method stub
		return false;
	}

	

	@Override
	public void searchStudent(ArrayList<StudentList> list) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void studentAttendance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertAttendance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAttendance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDateAttendance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dateAttendance() {
		// TODO Auto-generated method stub
		
	}



}
