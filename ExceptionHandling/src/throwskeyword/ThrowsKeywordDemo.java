package throwskeyword;

public class ThrowsKeywordDemo {

	public static void main(String[] args) {
		
		try {
			Math.div(1,  0);
		} catch (ArithmeticException e) {
			System.out.println("ThrowsKeywordDemo => Division by zero");
		}

	}

}
