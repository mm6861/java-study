package exam.ex03;

public class Person {
	public static String name;
	public static int age;
	
	public static void main(String[] args) {
		
		Person[] p = new Person[3];		
		for(int i=0;i<p.length;i++) {	
			
			p[i] = new Person(); 
			p[i].name = "이름" + i;
			p[i].age = i;
		}
		
//		Person.name = "난 무조건 하나야!";
		
		for(int i=0;i<p.length;i++) {
			System.out.println("p["+i+"].name => " + p[i].name);
		}


		
	}
}
