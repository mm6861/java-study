package collection.list;

import java.util.ArrayList;
import java.util.List;

class Cat{
	private String name;
	private int age;
	// 애네들은 접근 막고
	// 갯터 셋터를 통해 접근하게 
	
	public Cat() {
		super();
	}
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
	
}
class Sham extends Cat{
	
}
public class CatList {
	public static void main(String[] args) {
		List<Cat> catList = new ArrayList<>();
		for(int i=0;i<10;i++) {
			// 고양이 이름은 냥이1~냥이10
			// 나이는 랜덤으로 1살부터 30살까지
			Cat cat = new Cat();
			catList.add(cat);
			cat.setName("냥이" + (i+1));
			cat.setAge((int)(Math.random()*30+1));
		}
		// 반복문을 사용해서 위에서 생성된 고양이들을 출력해주세요.
		for(int i=0;i<10;i++) {
			System.out.println(catList.get(i));
		}
	}
}
