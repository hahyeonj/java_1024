package day20;

import java.util.ArrayList;

import lombok.Data;

@Data
public class PhoneNumber {
	private String fullName;
	private ArrayList<String> PhoneNumber = new ArrayList<String>();
	
	@Override
	public String toString() {
		return "[" + fullName + "이름 " + PhoneNumber + ", 전화번호 :" + "]";
	}

	public PhoneNumber(String fullName, ArrayList<String> phoneNumber) {
		this.fullName = fullName;
		PhoneNumber = phoneNumber;
	}
	
	
}
