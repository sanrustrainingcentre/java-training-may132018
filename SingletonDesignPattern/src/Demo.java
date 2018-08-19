
public class Demo {

	public static void main(String[] args) {
		GpsManager gpsManager = GpsManager.getInstance();
		
		GpsManager gpsManager2 = GpsManager.getInstance();
		
		System.out.println(gpsManager == gpsManager2);
	}

}
