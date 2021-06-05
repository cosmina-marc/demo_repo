package automation;

// 1. Calculate the sum of the first 100 integer numbers higher than 0
// conform enuntului ar fi trebuit sa incepem de la 1 dar in acest caz o nu influenteaza
//apelam clasa OddNumber
public class Sum100 {

	public static void main(String[] args) {

		int sum = 0;
		boolean isOddNr;
		for (int n = 0; n < 100; n++) {
			sum = sum + n; // se mai poate scrie si asa sum+=n
			System.out.println("Suma intermediara" + " " + n);
		}
		System.out.println(sum);
		isOddNr = OddNumber.isOddNumber(sum);
		System.out.println(isOddNr);
	}
}