package automation;

public class OddNumber {

	public static void main(String[] args) {

		int valueToEvaluate = Integer.parseInt(args[0]);

		boolean isOddNr = isOddNumber(valueToEvaluate);

		System.out.print(isOddNr);

	}

	public static boolean isOddNumber(int number) {

		if (number % 2 == 0) {
			return false;
		}
		return true;
	}

}
