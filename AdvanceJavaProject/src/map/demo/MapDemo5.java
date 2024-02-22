package map.demo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo5 {

	public static void main(String[] args) {
		Map<String,String> map = new TreeMap<String, String>();
		map.put("RN101", "Shubham");
		map.put("RN102", "Mahima");
		map.put("RN103", "Rahul");	
		map.put("RN104", "Rajat");
		map.put("RN105", "Sonali");
		map.put("RN1001", "Ram");
		
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			System.out.println(key+ "-->" +map.get(key));
		}

	}

}
