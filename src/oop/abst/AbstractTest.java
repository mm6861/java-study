package oop.abst;

interface viewer{
	void show();
	void off();
}

public class AnonymouseTest implements viewer{
	
	public static void main(String[] args) {
		viewer at = new viewer();
		public void show() {
			System.out.println("삼성티비 켬");
		}
	}
	
}
