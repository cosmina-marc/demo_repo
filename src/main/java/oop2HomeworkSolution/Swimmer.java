package oop2HomeworkSolution;

public class Swimmer extends Human {

	private Talker talker = new Talker();
	private Walker walker = new Walker();

	public void swim() {

	}

	public void talk() {
		talker.talk();
	}

	public void walk() {
		walker.walk();

	}
}
