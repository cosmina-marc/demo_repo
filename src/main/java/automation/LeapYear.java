package automation;

import java.util.Scanner;

public class LeapYear {

	/*
	 * Display the number of days in month February from a year between 1900-2016 that is read from keyboard HINT A year is a leap year if: - Is divisible by 4 but not by 100 OR - Is divisible by 400
	 **/

	public static void main(String[] args) {
		// message: enter year
		System.out.println(" Enter a year between 1900 and 2016: ");
		// year to be checked
		Scanner keyboard = new Scanner(System.in);

		int year;
		year = keyboard.nextInt();

		// verify the leap year

		if (year >= 1900 && year <= 2016) {

			if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
				System.out.println(" " + year + " is a leap year and February has 29 days");

			} else {
				System.out.println(" " + year + " is NOT a leap year and February has 28 days");
			}

		} else {
			System.out.println(" " + year + " is NOT between 1900-2016 ");
		}

		keyboard.close();
	}

}
