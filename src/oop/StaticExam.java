package oop;

public class StaticExam {
	// JVM 이 실행되면 
	// static으로 되있는 녀석 먼저 읽어들임
	 
	 static int num = 1;
	
	public static void main(String[] args) {
		System.out.println(StaticExam.num);
	}
}
