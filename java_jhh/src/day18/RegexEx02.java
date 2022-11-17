package day18;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexEx02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String id = "^[a-z0-9_\\-]{5,20}$";
		
		System.out.println("가입할 아이디를 작성해주세요");
		System.out.println();
		String idTry = scan.next();
		boolean idMatch = Pattern.matches(id, idTry);
		if(idMatch)
			System.out.println(idMatch + "는 적절한 아이디입니다.");
		else
			System.out.println(idMatch + "는 적적한 아이디가 아닙니다.");
		scan.close();
	}

}
