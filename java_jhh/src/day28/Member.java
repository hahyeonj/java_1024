package day28;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import lombok.Data;

@Data
public class Member implements Serializable {
	
	
	private String id, pw;
	private Date joinDate;
	private Authority authority;
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(id, other.id) && Objects.equals(pw, other.pw);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result +((id ==null) ? 0 : id.hashCode());
		result = prime * result +((pw ==null) ? 0 : pw.hashCode());
		return result;
	}
	public Member(String id, String pw, Authority authority) {
		super();
		this.id = id;
		this.pw = pw;
		this.authority = authority;
		joinDate = new Date();
	}
	public Member(String id, String pw) {
		this(id, pw, Authority.MEMBER)
	}
}
enum Authority{
	ADMIN, MEMBER
}