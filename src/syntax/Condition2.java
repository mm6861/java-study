package syntax;

public class Condition2 {
	
	public static String getStr() {
		return "ABC";
	}
	
	public static void main(String[] args) {	
	
		int a = 4;
		String str = (a==3) ? "a는 3이다." : "a는 3이 아니다";
		
		System.out.println(str);
		
		String s1 = "Dog";
		System.out.println(s1.toLowerCase().equals("dog"));
		// toLowerCase() 은 String생성자의 메서드임을 알 수 있다.
		
		String str1 = getStr();
		System.out.println(str1);	//ABC
		System.out.println(str1.toLowerCase());	// ABC소문자변환
		// toLowerCase() 매서드임!!! return값을 받는거지
		// 값이 변경되지는 않음 그래서 밑에 실행하면 
		System.out.println(str1);	// ABC
		
		str1 = str1.toLowerCase();	// 그래서 변수에 저장 
		System.out.println(str1);	// abc
		System.out.println(str1.equals("abc"));	// 같은지 비교
		System.out.println(str1.toLowerCase().equals("abc"));
		// toLowerCase(). 점 하고 쓸 수 있는 이유 반환값이 있기에
		
	}

}
