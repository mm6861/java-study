package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class BaseBall {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numList = new ArrayList<>();		
		for(int i=0;i<3;i++) {
			int ranNum = (int)(Math.random()*9+1);
			if(numList.indexOf(ranNum)==-1) {
				numList.add(ranNum);
			}else {
				i--;
			}
		}		
		System.out.println("numList : " + numList);		
		Scanner scan = new Scanner(System.in);
		System.out.println(", 를 기준으로 숫자 3개를 입력하시오.");
		String str = scan.nextLine();
		String[] strs = str.split(",");
		ArrayList<Integer> nums = new ArrayList<>();		
		for(int i=0; i<3;i++) {
			nums.add(Integer.parseInt(strs[i]));
		}		
		int o = 0;
		int b = 0;
		int s = 0;		
		for(int i=0;i<3;i++) {
			if(numList.indexOf(nums.get(i))!=-1) {
				if(i==numList.indexOf(nums.get(i))) {
					s++;
				}else {		
					b++;
				}
			}else {
				o++;
			}
		}
		if(s+b==0) {
			System.out.println("아웃!");
		}
		System.out.println("결과는 : "+s+" Strike, "+b+" Ball, "+o+"out");
		
		
		scan.close();
	}
}
