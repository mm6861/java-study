package oop;

public class ClassExam3 {
	
	int num = 1;
	// 실행하는거는 실행부에서만 가능
	// 아니면 자기만의 영역이 있는 곳 안에서만 가능
	
	void setNum() {
		System.out.println(num);
	}
	
	int getNum() {
		return num;
	}
	// 여기까지는 읽어들이는 것!! 실행 no!
	// 여기서부터 실행! 
	public static void main(String[] args) {
		
		ClassExam3 ce = new ClassExam3();
		System.out.println(ce.num);
		
		ce.num = 5;	
		System.out.println(ce.getNum());
		
		ce.setNum();
		
	}
}
