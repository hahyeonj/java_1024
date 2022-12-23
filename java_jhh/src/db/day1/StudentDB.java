package db.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentDB {
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	
	static Scanner scan = new Scanner(System.in);
	
	
	
	public StudentDB(String url, String id, String pw) throws  Exception {
		con = connect(url, id, pw);
		stmt = con.createStatement();
	}
	
	
	
	private void connect(String url,String id,String pw) throws Exception {

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("[DB 연결 성공]");
	}

	public static void connectClose(Connection con) {
		try{
            if( con != null && !con.isClosed()){
                con.close();
                System.out.println("[연결 해제]");
            }
        }
        catch( SQLException e){
            e.printStackTrace();
        }
	}
	
}	
