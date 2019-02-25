package collection.list;

import java.util.ArrayList;
import java.util.List;

class Person{
	private String name;
	public void setName(String name) {
		this.name= name;
	}
	public String getName() {
		return this.name;
	}
}
public class PersonList {
	public static void main(String[] args) {
		Person p = new Person();
	
		Person p1 = new Person();
		p1.setName("홍길동"+1);
		Person p2 = new Person();
		p2.setName("홍길동"+2);
		Person p3 = new Person();
		p3.setName("홍길동"+3);
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		System.out.println(p3.getName());
		
		Person p4 = p1;
		p4.setName("홍길동"+4);
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		System.out.println(p4.getName());
		
	}
}
	
	
