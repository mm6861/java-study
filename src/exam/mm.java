package exam;

class Snack{
	String name;
	int year;
}
public class mm {

	public static void main(String[] args) {
		
		Snack[] foods = new Snack[5];
		
		for(int i=foods.length-1;i>=0 && i<=foods.length;i--) {
			
			foods[i] = new Snack();
			foods[i].name = "Apple" + i;
			foods[i].year = i * 2;
		}
		System.out.println("이 음식의 이름은 " + foods[4].name + "이며, 유통기한은" + foods[4].year);
	}
}
