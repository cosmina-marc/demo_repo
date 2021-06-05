package automation.oop2;

import java.util.ArrayList;
import java.util.List;

import automation.oop1.Circle;

public class TestCollections {
	public static void main(String[] array) {

		List list = new ArrayList();

		list.add("list element");
		list.add("another list element");
		list.add(7);
		list.add(new Circle());

		Object secondElement = list.get(3);
		if (secondElement instanceof String) {

			String firstElement = (String) secondElement;
			String firstSub = firstElement.substring(2);
			System.out.println(firstSub);

		} else if (secondElement instanceof Circle) {

			Circle firstElement = (Circle) secondElement;
			System.out.println(firstElement.draw());
		}

	}

}
