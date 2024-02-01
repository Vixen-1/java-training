package effigo.ayushi.training.treemap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		Map<Integer, Integer> maps = new TreeMap<>();
		 maps.put(1,  200);
		 maps.put(2,  201);
		 maps.put(3,  202);
		 
		 System.out.println("Getting element from specific key");
		 System.out.println(maps.get(2));
		 
		 System.out.println("Check if following element is present; ");
		 boolean res = maps.containsKey(3);
		 System.out.println(res? "yes": "no");
		 
		 for(Entry<Integer, Integer> map : maps.entrySet()) {
			 System.out.println(map);
		 }
	}
}
