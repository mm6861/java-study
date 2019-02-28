package db.board;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardService {
	
	public void selectBoard() {
		String sql = "select * from board_info";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
		    while(rs.next() ) {
		    	System.out.println(rs.getString("bi_num") + ". 제목 : " + rs.getString("bi_title")+", 내용 : " + rs.getString("bi_content"));
		    
		    }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBCon.close();
		}
	}
	public void insertBoard(String title, String content) {
		String sql = "insert into board_info(bi_num,bi_title,bi_content,bi_credat,bi_cretim)";
		sql +=" values(seq_bi_num.nextval,?,?,to_char(sysdate,'YYYYMMDD'),\r\n" + 
				" TO_CHAR(SYSDATE,'HH24MISS'))";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(
					sql);
			// DBCon.getCon() 호출로 통화준비 마침
			ps.setString(1, title);
			ps.setString(2, content);
			int cnt = ps.executeUpdate();	// 통화함 
			if(cnt==1) {
				System.out.println("정상적으로 게시물이 등록 완료!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBCon.close();
		}
	}
	public void deletBoard(String num) {
		String sql = "delete from board_info where bi_num=?";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setString (1,num);
			int cnt = ps.executeUpdate();

			if(cnt==1) {
				System.out.println("지웠지~~~~");
			}else {
				System.out.println("지우려는게 없어!");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	public void updateBoard(String num, String title, String content) {
		String sql = "update board_info set bi_title=?, bi_content=? where bi_num=?";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setString(3, num);
			int cnt = ps.executeUpdate();
			if(cnt==1) {
				System.out.println("업데이트완료");
			}else {
				System.out.println("업데이트 미완료");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
