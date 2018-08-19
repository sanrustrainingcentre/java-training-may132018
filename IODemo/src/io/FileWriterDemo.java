package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		
		//Step 1: Locate or Represent a file with a path
		File file = new File("test-output_1.txt");
		
		try {
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			String data = "jakshdf kajhsdf kjlashdjfklahsdf jklahsdf";
//			fileWriter.write(data);
			
//			fileWriter.flush();
//			fileWriter.close();
			
			bufferedWriter.write(data);
			bufferedWriter.flush();
			bufferedWriter.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		


	}

}
