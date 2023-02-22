package day33;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date {
	Date date = new Date();
	//Date를 원하는 패턴의 시간형태로 문자열로 변환
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	String dateStr = format.format(date);
	System.out.println(dateStr);

	
	/*Date date = new Date();
	SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
	String dateSt = format.format(date);
	System.out.println(dateSt);*/
}
