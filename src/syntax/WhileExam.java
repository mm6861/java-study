package syntax;

public class WhileExam {
	public static void main(String[] args) {
		int num = 1;
		 do {	// 최소 한번은 실행해야 하는 경우 
			System.out.println(num);
			num++;
		}while(num>=5);
	}
}
