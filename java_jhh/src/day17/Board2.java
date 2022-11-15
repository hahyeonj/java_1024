package day17;

import java.util.Date;
import java.util.Objects;

import lombok.Data;

@Data
public class Board2 {
	// 게시글은 번호, 제목, 내용, 작성자, 작성일, 조회수
	private int num, countNum;
	private String  headLine, contents, writer ;
	private Date writeDate = new Date();
	
	
	@Override
	public String toString() {
		return "Board [num=" + num + ", countNum=" + countNum + ", headLine=" + headLine + ", contents=" + contents
				+ ", writer=" + writer + ", writeDate=" + writeDate + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Board2 other = (Board2) obj;
		return Objects.equals(contents, other.contents) && countNum == other.countNum
				&& Objects.equals(headLine, other.headLine) && num == other.num
				&& Objects.equals(writeDate, other.writeDate) && Objects.equals(writer, other.writer);
	}


	@Override
	public int hashCode() {
		return Objects.hash(contents, countNum, headLine, num, writeDate, writer);
	}

	public Board2(int num, int countNum, String headLine, String contents, String writer, Date writeDate) {
		super();
		this.num = num;
		this.countNum = countNum;
		this.headLine = headLine;
		this.contents = contents;
		this.writer = writer;
		this.writeDate = writeDate;
	}
	
}
