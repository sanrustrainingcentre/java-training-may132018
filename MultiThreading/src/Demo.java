
public class Demo {

	public static void main(String[] args) {
		
		//gets the currently executing thread
		Thread currentThread = Thread.currentThread();
//		System.out.println(currentThread);
		
//		//1. Creating a thread object. At this point, thread is not running.
//		MyThread myThread = new MyThread();
//		
//		//2. Starts execution of a thread.
//		myThread.start();
		
		DownloadTask downloadTask1 = new DownloadTask("wallpaper.jpeg");
		DownloadTask downloadTask2 = new DownloadTask("wallpaper1.jpeg");
		DownloadTask downloadTask3 = new DownloadTask("wallpaper2.jpeg");
		
		MyThread t1 = new MyThread(downloadTask1);
		MyThread t2 = new MyThread(downloadTask2);
		MyThread t3 = new MyThread(downloadTask3);
		t1.start();
		t2.start();
		t3.start();
		
		for (int j = 0; j < 5; j++) {
			System.out.println("[Main] j = " + j);
		}
		
//		for (int j = 0; j < 100; j++) {
//			System.out.println("[Main] j1 = " + j);
//		}
		
		
		try {
			t1.join();
//			t2.join();
//			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("End of main() method");

	}

}
