package db.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";	
	private static final String USER = "osfu";
	private static final String PASSWORD = "12345678";
	private static Connection con;
	
	
	public static Connection getCon() {
		if(con==null) {
			//처음호출 전화검
			try {
				con = DriverManager.getConnection(URL, USER, PASSWORD);
			} catch (SQLException e) {				
				e.printStackTrace();
			}
		}
		return con;	// 통화할 준비 마침 
	}
	public static void close() {
		if(con!=null) {
			try {
				con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		con = null;
		System.out.println(con);
	}
	public static void main(String[] args) {
		getCon();
		close();
	}
}
