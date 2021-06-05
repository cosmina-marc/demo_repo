package automation.exception;

public class CatchException {

	public static void main(String[] args) {

		try {
			int age = Integer.parseInt(args[0]);
			// do something with age…
			System.out.println(age + 1);
		} catch (NumberFormatException | ArrayIndexOutOfBoundsException ex) {
			System.out.println("First argument need to be an int " + ex.getMessage());

		}

	}
}
