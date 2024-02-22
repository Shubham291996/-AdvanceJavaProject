package map.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(101, "Shubham");
		map.put(102, "Mahima");
		map.put(103, "Rahul");	
		map.put(104, "Rajat");
		map.put(105, "Sonali");
		
		Set<Integer> keySet = map.keySet();
		for(Integer key : keySet) {
			System.out.println(key+ "-->" +map.get(key));
		}
		

	}

}
