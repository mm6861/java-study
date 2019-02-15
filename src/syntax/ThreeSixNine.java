package syntax;

public class ThreeSixNine {
	public static void main(String[] args) {
		for(int i=0;i<30;i++) {
//			if(i==0) {
//				System.out.print(i);
//			}else if(i%3==0) {
//				System.out.print("짝");
//			}else {
//				System.out.print(i);
//			}
//-----------------------------------------------			
//			if(i==0 || i%3!=0) {
//				System.out.print(i);
//			}else {
//				System.out.print("짝");
//			}
//-------------------------------------------
			int mod = i % 10;
			if(mod==3 || mod==6 || mod==9) {
				System.out.println("짝");
			}else {
				System.out.println(i);
			}
			
			
			
		}
	}
}
