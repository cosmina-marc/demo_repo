package automation.oop2v2;

public class Main {

	public static void main(String[] args) {

		Swimmer swimmer = new Swimmer();

		Walker walker = new Walker();
		System.out.println(walker.getClass()
				.getSimpleName() + " can:");
		walker.walk();
		walker.breathe();

		Talker talker = new Talker();
		System.out.println(talker.getClass()
				.getSimpleName() + " can:");
		talker.talk();
		talker.breathe();

	}

}
