package day22;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import lombok.Data;

@Data
public class StudentList {
	private String StudentName;
	private Date birthday;
	ArrayList<AttendanceList> atlist;	
	
	public StudentList(String stdName, String birthday, ArrayList<AttendanceList> atlist) throws ParseException {
		this.StudentName = stdName;
		setBirthday(birthday);
		this.atlist = atlist;
	}

	public StudentList(String stdName, String birthday) throws ParseException {
		this.StudentName = stdName;
		setBirthday(birthday);
	}

	public void setBirthday(String birthday) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		this.birthday = format.parse(birthday);
	}
}
