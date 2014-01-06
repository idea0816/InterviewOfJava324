package ch10;

public class TextDemo_1 {
	public static void main(String[] args) {
		RunnableDemo r1 = new RunnableDemo();
		r1.RDemo(r1);
		System.out.println(r1.print());
	}
}

class ThreadRun {
	public String print() {
		return "I am RunnableDemo's Parent";
	}
}

class RunnableDemo extends ThreadRun implements Runnable {
	Thread t2 = null;

	public void RDemo(RunnableDemo r1) {
		Thread t1 = new Thread(r1, "Thread 1");
		System.out.println("Now Running :" + t1);
		t2 = new Thread(r1, "Thread 2");
		System.out.println("Running Thread 2");
		System.out.println("Thread 1 Sleep");
		t2.start();
		try {
			t1.sleep(400);
		} catch (InterruptedException e) {
			System.out.println("Thread 1 Error");
		}
		System.out.println("Thread 1 back");

	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 800; i += 100) {
				System.out.println("Thread 2 sleep time :" + i);
				t2.sleep(i);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread 2 Error");
		}

	}

}