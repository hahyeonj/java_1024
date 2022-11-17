package day19;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex01 {

	public static void main(String[] args) {
		/* 
		 * 
		 * [a-zA-Z0-9\-_]+@[a-zA-Z0-9\-]{2,}(\.[a-zA-Z]+){1,2}
		 * */
		
		
		
		String regex = "^[a-zA-Z0-9\\-_]+@[a-zA-Z0-9\\-]{2,}(\\.[a-zA-Z]+){1,2}$";
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		
		
		if(Pattern.matches(regex, str)) {
			System.out.println(str + "은 이메일 형식입니다.");
		}else {
			System.out.println(str + "은 이메일 형식이 아닙니다.");
		}
		
		scan.close();
		
	}

}
