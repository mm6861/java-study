package collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapExam3 {
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1, "가만두지 않겠다.");
		map.put(2, "마지막이다.");
		map.put(3, "음....");
		System.out.println(map);
		
		// 고양이 이름은 냥이1~냥이10
		// 나이는 랜덤으로 1살부터 30살까지
		
		List<HashMap<String,Object>> catList = new ArrayList<>(); 
		for(int i=0;i<10;i++) {
			HashMap<String,Object> cat = new HashMap<>();
			catList.add(cat);
			cat.put("name","냥이"+(i+1));
			cat.put("age", (int)(Math.random()*30+1));
		}
		for(int i=0;i<10;i++) {
			HashMap<String,Object> c= catList.get(i);
			c= new HashMap<>();
			c.put("Name","냥이!!!");
			System.out.println(catList.get(i));
		
		}
	}
}
