package serialization;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Demo {

	public static void main(String[] args) {
		
		String jsonFileName = "contacts.json";
		FileReader fileReader;
		try {
			fileReader = new FileReader(jsonFileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			String data = "";
			String str = bufferedReader.readLine();
			while (str != null) {
				data = data + str;
				str = bufferedReader.readLine();
			}
			
			System.out.println(data);
			bufferedReader.close();
			
			Gson gson = new Gson();
			Contact contact = gson.fromJson(data, new TypeToken<Contact>() {}.getType());			
			System.out.println(contact);
			
			String jsonText = gson.toJson(contact);
			
			FileWriter fileWriter  = new FileWriter("json_output.json");
			fileWriter.write(jsonText);
			fileWriter.flush();
			fileWriter.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
