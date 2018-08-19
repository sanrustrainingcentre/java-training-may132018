
public class EnumDemo {

	public static void main(String[] args) {
		
		System.out.println(Color.ORAN_GE);
		
//		int color = 0;
		Color color = Color.RED;
		System.out.println(color.getHexValue());
		
		Color[] allColors = Color.values();
		Color orange = Color.valueOf("ORAN_GE");
		System.out.println(orange);
		
		
		switch (color) {
			case ORAN_GE:
				
				break;
				
			case RED:
				break;
				
			case YELLOW:
				break;
	
			default:
				break;
		}

	}

}
