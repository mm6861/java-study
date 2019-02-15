package oop;

public class ThisExam {
	int num = 10;
	
	void setNum(int num) {
		this.num = num;
		// 이클래스의 num = 매개변수 num
	}
	
	int getNum() {
		return num;		// 여기도 this가 생략된거임
		// return this.num;
	}
	public static void main(String[] args) {
		ThisExam te = new ThisExam();
		System.out.println(te.num);
		System.out.println(te.getNum());
		te.setNum(5);
		System.out.println(te.num);
		System.out.println(te.getNum());
	}
}
