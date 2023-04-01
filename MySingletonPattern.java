public class MySingletonPattern {
	private static MySingletonPattern obj = null;
	
	private MySingletonPattern() {}
	
	public static synchronized MySingletonPattern getInstance() {
		if(obj==null) {
			obj = new MySingletonPattern();
		}
		return obj;
	}
	
	public void printMessage() {
		System.out.println("Current Instance hashCode => " + this.hashCode());
	}
	
	public static void start() {
		System.out.println("Inside Singleton Class");
		
		MySingletonPattern object1 = getInstance();
		object1.printMessage();
		
		MySingletonPattern object2 = getInstance();
		object2.printMessage();
	}
}
