package data;

public class Type01 {
	
	public static void main(String[] args) {
		//문자
		char c = 'a';
//		c = "a";  	// 에러 왜? "" 이건 문자열!
		
		byte b = 127;
		b = -128;
		
		short sh = 123;
		
		int i = 12123123;
		
		long l = 1000000000l;		
		// 숫자의 기본 데이터타입은 int 그래서 long형입을 알려주기 위해 끝에 l 붙임
		
		// 숫자 - 실수
		float f = 1.2f;	// 실수의 기본 데이터타입은 double 그래서 뒤에 f
		double db = 1.2;
		
		//논리형(불린)
		boolean bl = true;
	}

}
