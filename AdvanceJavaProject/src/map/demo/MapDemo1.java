package map.demo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(101, "Shubham");
		map.put(102, "Mahima");
		map.put(103, "Rahul");	
		map.put(104, "Rajat");
		System.out.println(map.get(101));
		System.out.println(map.get(102));
		System.out.println(map.get(103));
		System.out.println(map.get(104));
	}

}
