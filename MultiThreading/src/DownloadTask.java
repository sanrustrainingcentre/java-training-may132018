
public class DownloadTask implements Runnable {
	String file;
	
	DownloadTask(String file) {
		this.file = file;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Downloading " + file + " from network....Progress=" + i + "%");
		}
	}

}
