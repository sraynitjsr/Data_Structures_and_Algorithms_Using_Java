class MyThreadOne implements Runnable {
	public void run() {
		for (int i=0; i<5; i++) {
			System.out.println("Welcome to " + Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.getStackTrace();
			}
		}		
	}
}

class MySimpleThreading {
	public static void start() throws Exception {
		System.out.println("Creating Java Thread by Implementing Runnable Interface");
		MyThreadOne myThreadObject = new MyThreadOne();
		
		Thread t1 = new Thread(myThreadObject);
		t1.start();
		t1.join();

		Thread t2 = new Thread(myThreadObject);
		t2.start();
		t2.join();
	}
}
