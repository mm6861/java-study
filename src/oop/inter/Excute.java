package oop.inter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Excute {
	static void doWork(Developer d) {
		d.goOffice();
		d.working();
		d.eat();
		d.goHome();
	}
	static void doWork(Manager m) {
		m.goOffice();
		m.working();
		m.eat();
		m.goHome();
	}
	
	public static void main(String[] args) {
		Developer d = new Developer();		
		Manager m = new Manager();
		doWork(d);
		doWork(m);
		List<String> aList = new ArrayList<>();
		LinkedList<String> lList = new LinkedList<>();
	}
}
