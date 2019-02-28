package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		String id = "osfu";
		String pwd = "12345678";
		
		try {
			Connection con = DriverManager.getConnection(url,id,pwd);
			Statement stmt = con.createStatement();
			String sql = "select * from board";
			
			ResultSet rs =stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.print(rs.getString("num1")+",");
				System.out.print(rs.getString("num2")+",");
				System.out.print(rs.getString("sum")+",");
				System.out.print(rs.getString("reg_date")+",");
				System.out.print(rs.getString("content"));
				System.out.println();
			}
			System.out.println("연결성공");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
