package db.day3.vo;

import lombok.Data;

@Data
public class CourseVO {
	private int co_num;
	private String co_st_num;
	private int co_le_num;
	private String co_type;
	private String co_garde;
	
	public CourseVO(int co_num, String co_st_num, int co_le_num, String co_type, String co_garde) {
		this.co_num = co_num;
		this.co_st_num = co_st_num;
		this.co_le_num = co_le_num;
		this.co_type = co_type;
		this.co_garde = co_garde;
	}

}
