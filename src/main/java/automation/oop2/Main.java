package automation.oop2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		doSomething();

	}

	public static void doSomething() {
		List<String> list = new ArrayList<String>();

		list.add("string1");
		list.add("string1");

		LinkedHashSet<String> set = new LinkedHashSet<String>(list);

		set.add("ww");
		set.add("adsada");
		set.add("ww");

		for (String s : set) {
			System.out.println(s);
		}
	}
}
