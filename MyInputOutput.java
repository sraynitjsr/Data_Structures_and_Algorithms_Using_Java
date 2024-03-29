import java.io.*;

class MyInputOutput {
	public static void start() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a string");
		String myString = br.readLine();
		
		System.out.println("Enter an integer");
		int myInteger = Integer.parseInt(br.readLine());
		
		System.out.println("Enter a fractional number");
		float myFraction = Float.parseFloat(br.readLine());
		
		System.out.println("String => " + myString + " Integer => " + myInteger + " Float => " + myFraction);
	}
}
 