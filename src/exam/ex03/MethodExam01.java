package exam.ex03;

public class MethodExam01 {
	
	public String name = "홍길동";
	public static void setTest(MethodExam01 me1) {
		me1 = new MethodExam01(); 
								 
	}
	public static void main(String[] args) {
		MethodExam01 me = new MethodExam01();
		me.name = "임꺽정";
		MethodExam01.setTest(me);
		System.out.println(me.name);
		
		
	}
}
