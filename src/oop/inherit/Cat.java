package oop.inherit;

public class Cat extends Animal{
	Cat(int age, String type) {
		this.age = age;
		this.type = type;
	}
	
	public static void main(String[] args) {
		Cat cat = new Cat(6, "삼");
		// 이 클래스에서는 age, type 선언되지 않안지만
		// Animal 상속받았기 때문에!!! 
		cat.eat();
		cat.sleep();
		cat.run();
		
		Animal animal = new Dog(6, "푸들");
		
		animal.eat();
		animal.sleep();
		animal.run();
		
	}
}
