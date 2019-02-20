package exam.ex04;

public interface Action {
	public String name = "홍길동";
	// 인터페이스에서 변수 선언하면 자동으로 static!! 
	// 인터페이스에서 변수 선언하는일은 거의 없음 
	
	void speek();
	// 접근제어자 인터페이스에서는 생략했어도 public!!!! 
	public void sleep();
	public void eat();
}
