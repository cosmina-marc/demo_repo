package automation;

public class PrimeNumbers {

	public static void main(String[] args) {

		boolean nhasfactor = false;
		int p = 0;

		for (int n = 1; n < 1000000; n++) // n will be tested to see if it is a prime number
		{
			for (int a = 2; a < n; a++)// test whether n is a prime by checking whether it has any factors
			{
				if (n % a == 0) // n has a factor
				{
					nhasfactor = true;
				}
			}
			if (nhasfactor == false) // n is a prime number.
			{
				p++;
				System.out.printf(" %d\n", n, p);
			}
			nhasfactor = false;

		}
	}
}
