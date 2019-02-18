package exam;

class Food {
	String name;
	
}

public class FoodArray {
	public static void main(String[] args) {
		String[] menus = new String[5];
		menus[0] = "짜장면"; 
		menus[1] = "탕슉"; 
		menus[2] = "볶음밥"; 
		menus[3] = "짬뽕"; 
		menus[4] = "울면"; 
		
		Food[] foods = new Food[5];		
		
		for(int i=0;i<foods.length;i++) {
			foods[i] = new Food();			
			foods[i].name = menus[i];			
		}
		
		for(int i=0;i<foods.length;i++) {
			System.out.println(foods[i].name);
			
		}
	}
}
