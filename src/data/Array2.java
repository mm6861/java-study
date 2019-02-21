package data;

public class Array2 {
	
	public static int[] initArray(int size) {
		int[] nums = new int[size];
		for(int i=0;i<size;i++) {
			nums[i] = (int)(Math.random()*20)+1;
		}
		return nums;
	}
	public static void printArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}
	}
	public static int[] extendsSize(int size, int[] array) {
		
		int[] tmp = array;
		array = new int[array.length +size]; 		
		for(int i=0;i<tmp.length;i++) {
			array[i] = tmp[i];
		}
		return array;
	}
	public static void main(String[] args) {
		if(args.length!=3) {
			System.out.println("조건이 만족하지 않습니다.\n 프로그램을 종료합니다.");
			System.exit(0);
		}
		
		System.out.println(args[2] +"님 안녕하세요\n프로그램을 시작하겠습니다.");
		//	String[] 배열의 args 라는 변수명
		System.out.println(args.length);
		for(String str:args) {
			System.out.println(str);
		}
		int[] nums = initArray(5);
		nums = extendsSize(2,nums);
		printArray(nums);
		
	}
}
