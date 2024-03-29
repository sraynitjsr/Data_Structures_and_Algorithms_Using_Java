import java.util.*;

class MyHashMap {
	
	public static void displayHashMap(HashMap<String, Integer> myMap) {
		System.out.println("Current HashMap is\n");
		myMap.forEach((key,value) -> 
			System.out.println(key + " " + value)
		);
	}
	
	public static void start() {
		HashMap<String, Integer> myMap = new HashMap<>();
		
		myMap.put("E", 1);
		myMap.put("A", 3);
		myMap.put("B", 2);
		myMap.put("D", 4);
		myMap.put("C", 5);
		
		MyHashMap.displayHashMap(myMap);
	}
}
