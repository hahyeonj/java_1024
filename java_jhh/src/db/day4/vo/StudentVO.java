package db.day4.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor //모든 필드가 들어가 있는 생성자//부분은 따로 만들어야 함
@NoArgsConstructor //기본 생성자
public class StudentVO {
	private String st_num;
	private String st_name;
	private int st_semester;
	private String st_state;
	private String st_pr_num;
	
}
