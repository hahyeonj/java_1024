package example.accountbook;

import java.util.Scanner;

public class AccountbBookMain {

	public static void main(String[] args) {
		AccountBook ab = new AccountBook(new Scanner(System.in));
		ab.run();
	}

}
