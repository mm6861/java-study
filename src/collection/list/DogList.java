package collection.list;

import java.util.ArrayList;
import java.util.List;

class Dog {
	private String name;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}
public class DogList {
	// dogList를 만들어서 반복문으로 1부터 10까지
	// Dog를 총 10개 생성하여
	// name => 강아지 1~ 강아지 10, age = 1~10
	public static void main(String[] args) {
		
		List<Dog> dogList = new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			Dog dogs = new Dog();
			dogList.add(dogs);
			dogs.setName("강아지"+(i+1));
			dogs.setAge(i+1);
			
		}
		for(int i=0;i<10;i++) {
			Dog dogs = dogList.get(i);
			System.out.println("name: " +dogs.getName()+", age: " +dogs.getAge());
		}
		
	}
}
