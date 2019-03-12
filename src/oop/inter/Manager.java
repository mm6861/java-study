package oop.inter;

public class Manager implements Work{

	@Override
	public void goOffice() {
		System.out.println("매니저가 출근합니다. ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void working() {
		System.out.println("매니저가 일을합니다. ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void goHome() {
		System.out.println("매니저가 집에갑니다. ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		System.out.println("매니저가 밥먹습니다. ");
		// TODO Auto-generated method stub
		
	}
	
}
