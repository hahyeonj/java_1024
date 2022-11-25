 package day25;

import java.util.ArrayList;
import java.util.Scanner;

import lombok.Data;

public class Ex02_s {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Input> list = new ArrayList<Input>();
		int num;
		for(int i = 0; i < 5; i++) {
			System.out.print(i+1 + "번째 정수를 입력 : " );
			num = scan.nextInt();
			if(num % 2 == 0) {
				list.add(new Input(-num));
			}else {
				list.add(new Input(num));
			}
		}
		System.out.println(list);
	}

}

@Data
class Input{
	private int num;

	public Input(int num) {
		this.num = num;
	}
}