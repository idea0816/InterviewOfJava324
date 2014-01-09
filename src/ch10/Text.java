package ch10;

public class Text {
	public static void main(String[] args) {
		TextThread t = new TextThread();

		new Thread(t).start();
		new Thread(t).start();
	}
}

class TextThread implements Runnable {
	private int num = 5;

	//@Override
	public void run() {
		while (true) {
			synchronized (this) {
				if (num > 0) {
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						System.out.println(Thread.currentThread().getName()
								+ "Error");
					}
					System.out.println(Thread.currentThread().getName()
							+ " Number is " + num--);
				} else {
					System.out.println(Thread.currentThread().getName()
							+ " Quit ");
					break;
				}
			}
		}

	}

}
