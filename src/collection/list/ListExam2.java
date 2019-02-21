package collection.list;

import java.util.ArrayList;

public class ListExam2 {
	
	public static void main(String[] args) {
		ArrayList<Integer> numList  = new ArrayList();
		//100, 90..... 10 넣기  
//		for(int i=100;i>=10;i-=10) {
//			numList.add(i*10+10);	
//		}
		for(int i=10;i>=1;i--) {
			numList.add(i*10);	
		}
		
		for(int i=0;i<=9;i++) {
			System.out.println(numList.get(i));
		}
	}
}
