import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.Calendar;
import java.util.Date;

public class FileDemo {

	public static void main(String[] args) {
		
		File desktopFolder = new File("/Users/sanrustrainingcentre/Desktop");
		System.out.println(desktopFolder.isFile());
		File testFileUnderDesktopFolder = new File(desktopFolder, "test.txt");
		
		try {
			testFileUnderDesktopFolder.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("canExecute() = " + testFileUnderDesktopFolder.canExecute());
		System.out.println("canWrite() = " + testFileUnderDesktopFolder.canWrite());
		System.out.println("canRead() = " + testFileUnderDesktopFolder.canRead());
		
		testFileUnderDesktopFolder.setReadable(false);
		System.out.println("canRead() = " + testFileUnderDesktopFolder.canRead());
		
		
		File file1 = new File(desktopFolder, "test2.txt");
		try {
			boolean result = file1.createNewFile();
			if (result) {
				System.out.println("file created successfully");
			} else {
				System.out.println("file creation failed.");
			}
			
			System.out.println(file1.getPath());
			
			boolean deleteResult = file1.delete();
			if (deleteResult) {
				System.out.println("file deleted successfully");
			} else {
				System.out.println("file deletion failed.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		File file3 = new File(desktopFolder, "../Music/test.txt");
		System.out.println(file3.getAbsolutePath());
		try {
			file3.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		long lastModifiedTime = file3.lastModified();
		Date date = new Date(lastModifiedTime);
		System.out.println((1900 + date.getYear()) + "/" + date.getMonth() + "/" + date.getDay());
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		System.out.println(calendar.get(Calendar.YEAR) + "/" 
									+ (calendar.get(Calendar.MONTH) + 1) + "/" 
									+ calendar.get(Calendar.DAY_OF_MONTH)
									+ " " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) 
										+ ":" + calendar.get(Calendar.SECOND) + " " + calendar.get(Calendar.AM_PM));
		
		
		File app = new File("/Users/sanrustrainingcentre/Development/selenium-training-may212018/SeleniumTraining/drivers/chromedriver");
		long fileSize = app.length();
		System.out.println((fileSize) / (1024.0 * 1024) + " MB");
		
		
		
		
		File folder4UnderDesktopFolder = new File(desktopFolder, "folder4/folder2/folder3");
		folder4UnderDesktopFolder.mkdirs();
		
		
		 File folder1 = new File(desktopFolder, "folder1");
		 String[] allFilesUnderFolder1 = folder1.list();
		 for (int index = 0; index < allFilesUnderFolder1.length; index++) {
			 System.out.println(allFilesUnderFolder1[index]);
		 }
		 
		 String[] allTextFilesUnderFolder1 = folder1.list(new TextFilenameFilter());
		 System.out.println("All Text Files......");
		
		 for (int index = 0; index < allTextFilesUnderFolder1.length; index++) {
			 System.out.println(allTextFilesUnderFolder1[index]);
		 }
		 
		 String[] allImageFilesUnderFolder1 = folder1.list(new ImageFilenameFilter());
		 System.out.println("All Image Files......");
		
		 for (int index = 0; index < allImageFilesUnderFolder1.length; index++) {
			 System.out.println(allImageFilesUnderFolder1[index]);
		 }
		
		
		
		
		
		
		
		
		//File isbnFile = new File(URI.create("urn:isbn:893486572345"));
		//File networkFolder = new File("\\\\192.168.0.3\\folder\\test.txt");
	}

}
