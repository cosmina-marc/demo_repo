package automation.oop;

public class Author {

	private String name;
	private String email;

	public Author(String authorName, String authorEmail) {
		name = authorName;
		email = authorEmail;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

}
