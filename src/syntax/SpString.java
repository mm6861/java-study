package syntax;

public class SpString {
	public static void main(String[] args) {
		String str = "\"\ta\nb\\";
		// "를 값으로 원할때 \"
		// tab의 효과를 원할때 \t
		// 줄바꾼을 원할 떄 \n
		// \를 값으로 원할때 \\
		System.out.println(str);
	}
}
