package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingFileDemo {

	public static void main(String[] args) {
		
		//Step 1: Locate or Represent a file with a path
		File file = new File("test-output.txt");
		
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			
			String str = "Long textakldhkl ahdf klajsdhf aklsdhfkjlasdhfkasdfha";
			
//			byte data[] = str.getBytes();
//			fileOutputStream.write(data);
			
			for (int index = 0; index < str.length(); index++) {
				fileOutputStream.write(str.charAt(index));
			}
			
			fileOutputStream.flush();
			fileOutputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
