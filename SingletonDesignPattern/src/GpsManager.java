

public class GpsManager {
	
	private static GpsManager gpsManager;
	
	private GpsManager() {
		super();
	}
	
	public static GpsManager getInstance() {
		if (gpsManager == null) {
			gpsManager = new GpsManager();
		}
		
		return gpsManager;
	}

}
