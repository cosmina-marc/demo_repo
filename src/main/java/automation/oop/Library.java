package automation.oop;

public class Library {

	public static void main(String[] args) {

		String name = "Eminescu";
		String email = "eminescu@gmail.com";
		String bookName = "Poesii";
		double price = 4000;
		int year = 1883;

		Author author1 = new Author(name, email);
		Book book1 = new Book(bookName, year, author1, price);

		System.out.println("Book " + book1.getName() + " (" + book1.getPrice() + " RON), by " + book1.getAuthor()
				.getName() + ", published in " + book1.getYear());
	}
}
