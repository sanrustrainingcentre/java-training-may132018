package network;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class ReadingHtmlCodeFromNetworkDemo {

	public static void main(String[] args) {
		
		//Step 1: Locate the resource
		try {
			URL url = new URL("https://oracle.com/");
			HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
			InputStream is = httpsURLConnection.getInputStream();
			
			byte[] data = new byte[1024];
			int endOfFile = is.read(data);
			while(endOfFile != -1) {
				for (int index = 0; index < data.length; index++) {
					System.out.print((char) data[index]);
				}
				endOfFile = is.read(data);
			}
			
			is.close();
			httpsURLConnection.disconnect();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
