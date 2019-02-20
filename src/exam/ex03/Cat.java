package exam.ex03;

public class Cat {
	public String name;
	public int age;
	
	public String toString() {
		return "이고양이의 이름은 " + name + "이구요, 나이는 " + age + "입니다."; 
				
	}
	public static void main(String[] args) { 
		
		Cat[] cat = new Cat[3];
		
		for(int i=0;i<cat.length;i++) {
			cat[i] = new Cat();
			cat[i].name = "이름" + (i+1);
			cat[i].age = i;
		}
		
		for(int i=0;i<cat.length;i++) {
			System.out.println(cat[i].name);
			System.out.println("cat["+i+"].age = " + cat[i].age);
			System.out.println(cat[i]);
		}
		
		
	}
}
