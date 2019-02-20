package exam.ex04;

public class Cat implements Action{
	// Cat은 세가지 이름으로 불리울 수 있음
	// Cat Object Action 
	// 왜?? Action도 상위개념! 

	@Override
	public void speek() {
		System.out.println("말하다");
		
	}

	@Override
	public void sleep() {
		System.out.println("자다");
		
	}

	@Override
	public void eat() {
		System.out.println("먹다");
		
	}

}
