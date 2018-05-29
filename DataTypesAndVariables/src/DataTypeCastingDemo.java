
public class DataTypeCastingDemo {
	
	public static void main(String[] args) {
		
		int i = 100;
		
		//variable 'i' of int data type cannot be casted to byte data type,
		//as this leads to narrowing conversion. Hence, an explicit casting is required. i.e '(byte) i'
		byte b = (byte) i;
		
		char ch = '!';
		System.out.println(ch);
		
		ch = (char) ((int) ch + 1);
		System.out.println(ch);
		
		ch = (char) ((int) ch + 1);
		System.out.println(ch);
		
		ch = (char) ((int) ch + 1);
		System.out.println(ch);
		
		ch = (char) ((int) ch + 1);
		System.out.println(ch);
		
	}

}
