package exam;

class CatName{
	String name;
	int number;
	
}
public class Cat {
	public static void main(String[] args) {
		CatName[] catNames = new CatName[5];
		
		String str = "야옹이";
		
		for(int i=0;i<catNames.length;i++) {
			catNames[i] = new CatName();
			catNames[i].number = i+1;
			catNames[i].name = str + catNames[i].number;
		}
		for(int i=0;i<catNames.length;i++) {
			System.out.println(catNames[i].name);
		}
	}
}
