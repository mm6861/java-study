package exam.ex03;

public class MultiDimension {
	
	public int[][] nums = new int[100][];
	public int tmp = 1; 
	public static void main(String[] args) {
		
		MultiDimension md = new MultiDimension();
		
		for(int i=0;i<md.nums.length;i++) {
			md.nums[i] = new int[i+1];
			System.out.println(i + "층의 방의 갯수: "+ md.nums[i].length);
		}
		int num = 0;
		for(int i=0;i<md.nums.length;i++) {
			for(int j=0;j<md.nums[i].length;j++) {
				md.nums[i][j] = ++num; // num = num+1
			}
		}
		for(int i=0;i<md.nums.length;i++) {
			System.out.print(i+ "층 : ");
			for(int j=0;j<md.nums[i].length;j++) {
				System.out.print(md.nums[i][j] + ",");
			}
			System.out.println();
		}
	
		
	}

}
