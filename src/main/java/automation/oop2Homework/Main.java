package automation.oop2Homework;

public class Main {

	public static void main(String[] args) {

		Swimmer swimmer = new Swimmer("Swimmer");
		swimmer.swim();
		swimmer.walk();
		swimmer.talk();
		swimmer.breathe();

		Walker walker = new Swimmer("WAlker");
		walker.walk();
		walker.breathe();

		Talker talker = new Swimmer("Talker");
		talker.talk();
		talker.breathe();

	}

}
