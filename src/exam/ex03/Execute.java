package exam.ex03;

public class Execute {

	public static void main(String[] args) {
		Dog[] dogs = new Dog[10];
		
		for(int i=0;i<dogs.length;i++) {
			dogs[i] = new Dog();
			dogs[i].setAge(i);
			dogs[i].setName("멍멍이" + (i+1));
			
		}
		
		for(int i=0;i<dogs.length;i++) {
			System.out.println("dogs[" + i + "].name => " +dogs[i].getName());
			System.out.println("dogs[" + i + "].age => " + dogs[i].getAge());
			
		}
		
	}
}
