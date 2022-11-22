package day22;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.regex.Pattern;

import lombok.Data;

@Data
public class AttendanceList {
	
	private String studentName, attendance;  
	private Date birthday, attendaceDate;
		
	public void setAttendance(String attendance) {
			String regex = "\\'OX/\'{1}";
			
			if(Pattern.matches(regex, attendance)) {
				this.attendance = attendance;
			}else {
				throw new RuntimeException("예외 발생 : 잘못입력했습니다.");
			}
			
		
		}
	
	public AttendanceList(String stdName, String attendance, 
			String birthday, String atDate) throws ParseException {
		this.studentName = stdName;
		this.attendance = attendance;
		setBirthday(birthday);
		setAttendaceDate(atDate);
	}
	
	public void setBirthday(String birthday) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		this.birthday = format.parse(birthday);
	}
	
	public void setAttendaceDate(String atDate) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		this.birthday = format.parse(atDate);
	}

}
