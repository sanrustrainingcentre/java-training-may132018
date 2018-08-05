
public class ThreadSleepDemo {

	public static void main(String[] args) {
		
		for (int i = 0; i < 1000; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("i = " + i);
		}

	}

}
