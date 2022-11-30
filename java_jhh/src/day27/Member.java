package day27;

import lombok.Data;

@Data
public class Member {
	//회원 클래스 따로 만들기(ID, 비밀번호, 이름, 생년월일, 전화번호)
	private String name, ID, password, pNumber;

	public Member(String name, String iD, String password, String pNumber) {
		this.name = name;
		ID = iD;
		this.password = password;
		this.pNumber = pNumber;
	}

	@Override
	public String toString() {
		return "Member [ID=" + ID + ", password=" + password + "]";
	}
	
	
	
}
