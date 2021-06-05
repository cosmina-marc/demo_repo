package automation;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		if (args.length == 3) {
			double a = Double.parseDouble(args[0]);
			double b = Double.parseDouble(args[2]);
			String operator = args[1];
			double result;

			switch (operator) {

			case "+":
				result = a + b;
				System.out.println("Result is: " + result);
				break;

			case "-":
				result = a - b;
				System.out.println("Result is: " + result);
				break;

			case "*":
				result = a * b;
				System.out.println("Result is: " + result);
				break;

			case "/":
				result = a / b;
				System.out.println("Result is: " + result);
				break;

			default:
				System.out.println("Case is missing from switch statement");
			}

		}

		else {
			System.err.println("3 arguments are needed!");
		}

	}
}
