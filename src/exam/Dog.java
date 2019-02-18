package exam;

class Animal{

	int age;
	
}
public class Dog {
	public static void main(String[] args) {
		Animal[] animals = new Animal[5];
		for(int i=0;i<animals.length;i++) {
			animals[i] = new Animal();
			animals[i].age = i*2;
		}
		for(int i=0;i<animals.length;i++) {
			System.out.println(animals[i].age);
		}
	}
}
