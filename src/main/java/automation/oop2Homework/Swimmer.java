package automation.oop2Homework;

public class Swimmer implements Walker, Talker {

	public Swimmer(String name) {
		System.out.println(name + " can: ");
	}

	public void swim() {
		System.out.println("swim");

	}

	@Override
	public void walk() {
		System.out.println("walk");

	}

	@Override
	public void talk() {
		System.out.println("talk");

	}

	@Override
	public void breathe() {
		System.out.println("breathe");
	}

}
