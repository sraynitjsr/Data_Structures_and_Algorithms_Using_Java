class MyThreadTwo extends Thread {
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

class MyThreadingByExtending {
	public static void start() throws Exception {
		System.out.println("Creating Java Thread by Extending Thread Class");
		MyThreadTwo myThreadObjectOne = new MyThreadTwo();
		MyThreadTwo myThreadObjectTwo = new MyThreadTwo();

        myThreadObjectOne.start();
        myThreadObjectTwo.start();
	}
}
