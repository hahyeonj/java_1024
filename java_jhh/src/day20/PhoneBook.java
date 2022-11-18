package day20;

import java.util.ArrayList;

import lombok.Data;

@Data
public class PhoneBook {
	private String lastName, firstName, job;
	String fullName = lastName + firstName;
	ArrayList<PhoneNumber> phoneNumberList = new ArrayList<PhoneNumber>(); 
	
	
	
	
	
	
}
