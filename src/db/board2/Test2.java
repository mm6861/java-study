package db.board2;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		
		BoardService2 bs = new BoardService2();
		List<BoardInfoVO> biList = bs.selectBoard();
		System.out.println(biList);
	}
}
