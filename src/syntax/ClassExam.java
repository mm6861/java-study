package syntax;

public class ClassExam {
	int a = 1;
	char c = '1';
	String s = "1";  
	
	void test() {
		System.out.println("난 ClassExam꺼!");
	} 	
	public static void main(String[] args) {
		
		int a = 2;
		
		ClassExam ce = new ClassExam();
		ce.a =3;			
		ce = new ClassExam();	// 새로 선언 리셋!! 
		System.out.println(ce.a);
				
	}  
}
