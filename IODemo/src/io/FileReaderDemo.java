package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		
		//Step 1: Locate or Represent a file with a path
		File file = new File("test.txt");
		
		try {
			FileReader fileReader = new FileReader(file);
			
			int data = fileReader.read();
			while(data != -1) {
				System.out.print((char) data);
				data = fileReader.read();
			}
			
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
