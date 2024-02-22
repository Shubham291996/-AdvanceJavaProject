package map.demo;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo6 {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String, String>();
		map.put("RN101", "Shubham");
		map.put("RN102", "Mahima");
		map.put("RN103", "Rahul");	
		map.put("RN104", "Rajat");
		map.put("RN105", "Sonali");
		map.put("RN1001", "Ram");
		
		Set<Entry<String,String>> entrySet = map.entrySet();
		for(Entry<String,String> entry : entrySet) {
			System.out.println(entry.getKey()+ "-->" +entry.getValue());
		}

	}

}
