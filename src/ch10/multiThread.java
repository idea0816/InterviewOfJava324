package ch10;

public class multiThread {
	public static void main(String[] args) {
		ThreadSubName t1 = new ThreadSubName("Thread 1", 200);
		ThreadSubName t2 = new ThreadSubName("Thread 2", 500);
		ThreadSubName t3 = new ThreadSubName("Thread 3", 100);
		t1.start();
		t2.start();
		t3.start();
	}
}

class ThreadSubName extends Thread {
	private String threadName;
	private int Ms;

	public ThreadSubName(String name, int ms) {
		this.threadName = name;
		this.Ms = ms;

	}

	public void run() {
		try {
			sleep(Ms);
		} catch (InterruptedException e) {
			System.out.println("The Thread is Wrong");
		}
		System.out.println("Name:" + threadName + " Sleeptime:" + Ms);
	}
}
