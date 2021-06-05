package automation.oop2v2;

public class Swimmer extends Breather {

	private Walker walker;
	private Talker talker;

	public Swimmer() {
		System.out.println(this.getClass()
				.getSimpleName() + " can: ");
		breathe();

		walker = new Walker();
		walk();
		talker = new Talker();
		talk();
		swim();
	}

	public void walk() {
		walker.walk();
	}

	public void talk() {
		talker.talk();
	}

	public void swim() {
		System.out.println("swim");

	}

}
