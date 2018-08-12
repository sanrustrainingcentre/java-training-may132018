package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingFileDemo {

	public static void main(String[] args) {
		
		//Step 1: Locate or Represent a file with a path
		File file = new File("test.txt");
		

		try {
			//Step 2: Create file input stream object			
			FileInputStream fileInputStream = new FileInputStream(file);
			
			
			//Step 3: Start reading file byte by byte till the mark reaches end of the file.
			//Approach 1
//			int data = fileInputStream.read();
//			while (data != -1) {
//				System.out.print((char) data);
//				data = fileInputStream.read();
//			}
			
			//Approach 2
			byte[] buffer = new byte[1024];
			int endOfFile = fileInputStream.read(buffer);
			
			while(endOfFile != -1) {
				for (int index = 0; index < buffer.length; index++) {
					System.out.print((char) buffer[index]);
				}
				endOfFile = fileInputStream.read(buffer);
			}
			
			//Step 4: close the connection
			fileInputStream.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
