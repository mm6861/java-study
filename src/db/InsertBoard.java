package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertBoard {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,id,pwd);
			con.setAutoCommit(false);
			// getConnection 전화를 거는거!!
			// 전화를 걸었으면 반드시 끊어야지 
			// 프로그램이 종료되면 자동 끊기는데 이때 
			// 아무 값도 안주면 자동 commit 되는 거임 
			// con.setAutoCommit(false); 하면 자동커민안됨
			//con.setAutoCommit(); 이거의 기본값이 true인거임
			// 자동 커밋이 설정된 채 롤백할 수 없습니다.
			Statement stmt = con.createStatement();
			String title = "게시물제목!!";
			String content = "게시물 내용!";
			String sql = "insert into board_info";  
			sql += "(bi_num, bi_title, bi_content, \r\n" +
					"bi_credat, bi_cretim)";
			sql += "values(5,?,?,to_char(sysdate,'YYYYMMDD'),\r\n" + 
					" TO_CHAR(SYSDATE,'HH24MISS'))";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			int cnt = ps.executeUpdate();	
			System.out.println(cnt);
			if(cnt==1) {
				System.out.println("정상적으로 1개가 입력되었따");
			}else if(cnt==0) {
				System.out.println("몰라 안들어 갔는데?");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// finally 위에서 오류가 나던 안나던 이거는 반드시 실행!
			try {		
				if(con!=null) {
					// con이 널인데 con.close();하면
					// 널익셉션 오류나기에!! 
					con.rollback();
					con.close();
				}
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		}
	}
}
