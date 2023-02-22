package db.day4.dao;

import java.util.ArrayList;


import db.day4.vo.StudentVO;


public interface StudentDAO {
	
	int insertStudent(StudentVO std);

	StudentVO selectStudent(String st_num);

	int updateStudent(StudentVO std);

	ArrayList<StudentVO> selectAllStudent();
}
