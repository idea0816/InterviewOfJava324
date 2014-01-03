package ch10;

public class SingleThread {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		t.setName("SingleThread");
		System.out.println(t.getName());
		try {
			for(int i = 0; i < 5; i++){
				System.out.println("Sleep Time:" +i);
				Thread.sleep(300);
			}
		} catch (InterruptedException e) {
			System.out.println("thread error");
		}
	}
}
