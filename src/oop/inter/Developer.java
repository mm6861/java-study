package oop.inter;

public class Developer implements Work{

	@Override
	public void goOffice() {
		System.out.println("개발자가 출근을 합니다 ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void working() {
		System.out.println("개발자가 일을 합니다. ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void goHome() {
		System.out.println("개발자가 퇴근 합니다. ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		System.out.println("개발자가 밥먹습니다. ");
		// TODO Auto-generated method stub
		
	}
	
}
