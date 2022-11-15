package day16;

import java.util.Objects;

import lombok.Data;

@Data
public class Member1 {
	private String id, pw, name, residentNum;
	private int age;
	
	
	
	@Override
	public String toString() {
		return "Member1 [id=" + id + ", pw=" + pw + ", name=" + name + ", residentNum=" + residentNum + ", age=" + age
				+ "]";
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member1 other = (Member1) obj;
		return age == other.age && Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(pw, other.pw) && Objects.equals(residentNum, other.residentNum);
	}


	@Override
	public int hashCode() {
		return Objects.hash(age, id, name, pw, residentNum);
	}

	
	public Member1(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	public Member1(String id, String pw, String name, String residentNum, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.residentNum = residentNum;
		this.age = age;
	}

	public void update(String pw, String name, String residentNum, int age) {
		this.pw = pw;
		this.name = name;
		this.residentNum = residentNum;
		this.age = age;
	}
	
}
