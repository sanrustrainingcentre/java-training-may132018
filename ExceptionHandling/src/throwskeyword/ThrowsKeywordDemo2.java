package throwskeyword;

public class ThrowsKeywordDemo2 {

	public static void main(String[] args) {

		try {
			Math.div(1,  0);
		} catch (ArithmeticException e) {
			System.out.println("ThrowsKeywordDemo2 => Division by zero");
		}

	}

}
