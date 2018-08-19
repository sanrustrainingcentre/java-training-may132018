
public class StringDemo {

	public static void main(String[] args) {
		
		String str = "ABC";
		String str1 = new String("ABC");
		String str2 = "TRUE";
		String str3 = "true";
		
		System.out.println(str == str1);
		System.out.println(str2.equalsIgnoreCase(str3));
		
		
		StringBuffer sb = new StringBuffer("Hello World");
		sb.append(" 123");
		String sbResult = sb.toString();

	}

}
