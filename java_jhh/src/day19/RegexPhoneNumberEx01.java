package day19;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexPhoneNumberEx01 {

	public static void main(String[] args) {
		/* 		
		 * 010-[0-9]{4}-[0-9]{4}
		 * 010-\d{4} -\d{4}
		 * 010-(-\n{4}){2}
		 * */
		
		String regex =  "010-(-\n{4}){2}";
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		if(Pattern.matches(regex, str)) {
			System.out.println(str + "은 전화번호 입니다.");
		}else {
			System.out.println(str + "은 전화번호가 아닙니다.");
		}
		
		scan.close();
	}

}
