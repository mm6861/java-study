package exam.ex03;

public class StaticExam01 {

	public static String name = "하하";
	public String name1 = "호호";
	
	public static void test() {
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		name = "나나";
		System.out.println(StaticExam01.name);
		test();
	}
}
