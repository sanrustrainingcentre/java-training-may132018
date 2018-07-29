package throwskeyword;

public class ThrowsKeywordDemo1 {

	public static void main(String[] args) {
		try {
			Math.div(1,  0);
		} catch (ArithmeticException e) {
			System.out.println("ThrowsKeywordDemo1 => Division by zero");
		}

	}

}
