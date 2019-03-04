package oop.generic;


public class TypeGeneric<T>{
	public void test() {
		
	}
	private Object o;
	private T t;
	
	public Object getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	
	public Object getO() {
		return o;
	}
	public void setO(Object o) {
		this.o = o;
	}
	public static void main(String[] args) {
		TypeGeneric<Integer> tg = new TypeGeneric<>();
		// 이제 위에 <T>는 Integer가 되는거임
		tg.setT(123);
		Integer i = tg.getT();
		tg.setO("abc");
		String o = (String)tg.getO();
	
	}
}
