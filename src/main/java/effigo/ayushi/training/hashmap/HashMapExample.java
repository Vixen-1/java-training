package effigo.ayushi.training.hashmap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

public class HashMapExample {
	public static void main(String[] args) {
		Map<Integer,String> mapList = new HashMap<>();
		mapList.put(1, "Ayushi");
		mapList.put(2, "Dhruv");
		mapList.put(3, "Vidushi");
		mapList.put(4, "Abhiyansh");
		
		//getting entry from specific key
		System.out.println("Element form specific key is: ");
		System.out.println(mapList.get(2));
		
		//check if hashmap contains following key
		System.out.println("Element is preset or not");
		boolean ans = mapList.containsKey(3);
		System.out.println(ans? "yes" : "no");
		
		for(Entry<Integer, String> map: mapList.entrySet()) {
			System.out.println(map);
		}
	}
}
