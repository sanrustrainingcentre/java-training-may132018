//
//public class Colors {
//	
//	public static final int ORANGE = 0;
//	public static final int YELLOW = 0;
//
//}

public enum Color {
	ORAN_GE(0xABC123),
	YELLOW(0xABC124),
	WHITE(0xFFFFFF),
	RED(0xABC456),
	GREEN(0xFF123F);
	
	private int hexValue;
	private boolean value;
	
	Color(int hexValue) {
		this.hexValue = hexValue;
	}
	
	Color(int hexValue, boolean value) {
		this.hexValue = hexValue;
		this.value = value;
	}

	/**
	 * @return the hexValue
	 */
	public int getHexValue() {
		return hexValue;
	}
	
	
}