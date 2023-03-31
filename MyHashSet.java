import java.util.*;

class MyHashSet {
	
	public static void displayHashSet(HashSet<Integer> mySet) {
		System.out.println("Current HashSet is\n");
		mySet.forEach((value) -> 
			System.out.println(value + " ")
		);
	}
	
	public static void start() {
		HashSet<Integer> mySet = new HashSet<>();
		
        mySet.add(5);
		mySet.add(2);
        mySet.add(4);
        mySet.add(5);
        mySet.add(1);

		displayHashSet(mySet);

        mySet.add(3);

        System.out.println("Trying to add 3 again");

        displayHashSet(mySet);
	}
}
