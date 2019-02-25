package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchList3 {
	public static void main(String[] args) {
		ArrayList<Integer> ranNums = new ArrayList<>();
		
		for(int i=0;i<6;i++) {
			ranNums.add((int)(Math.random()*45+1));
		}
//		System.out.println(ranNums);
		Scanner scan = new Scanner(System.in);
//		System.out.println(",를 구분자로 숫자 6개를 입력해주세요");
//		String numStr = scan.nextLine();
//		System.out.println("입력하신 숫자는 : " + numStr);
		String[] numStrs = scan.nextLine().split(",");
		int count = 0;
		for(String str:numStrs) {
			if(ranNums.indexOf(Integer.parseInt(str))!=-1) {
				count++;
			}
			
		}
		System.out.println("numList: " + ranNums);
		System.out.println("맞추신 수는 " + count + "입니다." );
		scan.close();
		
		
	}
}
