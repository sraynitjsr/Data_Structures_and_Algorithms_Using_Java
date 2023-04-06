public class MyMain {
	public static void main(String[] args) throws Exception {
		System.out.print("\n....Welcome to the world of Java....");
		
		System.out.println("");
		MyInputOutput.start();

		System.out.println("");
		MyArrayList.start();

		System.out.println("");
		MyHashSet.start();

		System.out.println("");
		MyHashMap.start();

		System.out.println("");
		MyFactoryPattern.start();

		System.out.println("");
		MySortByFrequency.start();

		System.out.println("");
		MySortByFrequencyStreamAPI.start();

		System.out.println("");
		MyThreadingByInterface.start();
		
		// Prefer Using Interface
		/*
			System.out.println("");
			MyThreadingByExtending.start();
		*/
		
		System.out.println("");
		MyKthSmallestAndLargestElement.start();

		System.out.println("");
		MySingletonPattern.start();
	}
}
