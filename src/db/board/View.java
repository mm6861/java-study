package db.board;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class View {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cmd = "";
	do {
		
		System.out.println("===================================");
		System.out.println(" 환영 합니다.");
		System.out.println(" 아래에서 아이디를 입력해보아요");
		System.out.println("===================================");
		System.out.println("아이디 : ");
		String id = scan.nextLine();
		if("osfu".equals(id)) {
			System.out.println("비밀번호 : ");
			String pwd = scan.nextLine();
			if(pwd.equals("12345678")) {
				BoardService bs = new BoardService();
				System.out.println("환영합니다. osfu님!!");
				while(!"q".equals(cmd)) {					
					System.out.println("1.게시물 등록");
					System.out.println("2.게시물 삭제");
					System.out.println("3.게시물 조회");
					System.out.println("4.게시물 수정");
					System.out.println("q.종료");
					System.out.println("원하시는 번호를 눌러주세요");
					System.out.println("번호 :");
					cmd = scan.nextLine();
					if("3".equals(cmd)) {
						bs.selectBoard();
					}else if("1".equals(cmd)) {
						System.out.println("제목 : ");
						String title = scan.nextLine();
						System.out.println("내용 : ");
						String content = scan.nextLine();
						bs.insertBoard(title,content);
					}else if("2".equals(cmd)) {
						System.out.println("삭제원하는 줄 번호가 먼데?");
						String num = scan.nextLine();
						bs.deletBoard(num);
					}else if("4".equals(cmd)) {
						System.out.println("몇번째 줄 수정원해?");
						String num = scan.nextLine();
						System.out.println("수정해봐! \n제목 : ");
						String title = scan.nextLine();
						System.out.println("내용 : ");
						String content = scan.nextLine();
						bs.updateBoard(num,title,content);
					}
				}
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else {
			System.out.println("없는 아이디 입니다!!");
		}
	}while(!"q".equals(cmd)); 
	}
}
