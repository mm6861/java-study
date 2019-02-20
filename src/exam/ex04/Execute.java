package exam.ex04;

public class Execute {
	
	public static void space(Action p) {
		p.sleep();
	}
	
	public static void main(String[] args) {
//		Cat c = new Cat();
//		Person p = new Person();
		
		Action c = new Cat();
		Action p = new Person();
		
		space(c);
		space(p);
	}
}
