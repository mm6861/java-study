package syntax;

public class Lopp4 {
	
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			
			if(i==3) ; 
			
			System.out.println(i);
		}
		
		int[] nums = new int[3];
		int[] nums2 = new int[5];
		nums = nums2;
		System.out.println(nums.length);
	}
}
