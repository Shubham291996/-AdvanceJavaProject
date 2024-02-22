package map.demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo4 {

	public static void main(String[] args) {
		Map<String,String> map = new LinkedHashMap<String, String>();
		map.put("RN101", "Shubham");
		map.put("RN102", "Mahima");
		map.put("RN103", "Rahul");	
		map.put("RN104", "Rajat");
		map.put("RN105", "Sonali");
		
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			System.out.println(key+ "-->" +map.get(key));
		}


	}

}
