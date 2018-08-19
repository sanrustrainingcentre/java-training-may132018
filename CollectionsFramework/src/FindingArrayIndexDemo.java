public class FindingArrayIndexDemo {

	public static void main(String[] args) {
		
		int[] values = {20, 0, 2, 100, 40, 50, 60, -1};
		
//		values[0] = 20;
//		values[4] = 100;//O(1)
		
		int value = -1;
		//O(N)
		for (int index = 0; index < values.length; index++) {
//			//O(N^2)
//			for (int j = 0; j < 1000; j++) {
//				
//			}
			if (value == values[index]) {
				System.out.println("Index of " + value + " is " + index);
				break;
			}
		}
	
	}

}
