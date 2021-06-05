package automation.oop2;

import java.util.ArrayList;
import java.util.List;

import automation.oop1.Circle;

public class Collection {

	public static void main(String[] args) {
		parameterList();

	}

	public static void parameterList() {

		Circle circle = new Circle();
		circle.setColor("blue");

		List<Circle> list = new ArrayList<Circle>(2);

		list.add(circle);
		list.add(new Circle());
		list.add(circle());
		list.add(1, circle);

		Circle circle2 = list.get(1);

		Circle circle1 = list.get(1);

		System.out.println(circle1.getColor());

		list.remove(new Circle());
		System.out.println(list.get(1));
	}

	public static void rawList() {
		List list = new ArrayList();

		list.add("list element");
		list.add("another list element");

	}
}
