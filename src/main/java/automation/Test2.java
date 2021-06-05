package automation;

/**
 * Class in charge with drawing shapes
 * 
 * @author cosmina.marc
 *
 */

public class Test2 {

	public static void main(String[] args) {

		drawFullShape(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		// drawShapeOutline(4, 5);
		// drawShapeCorners(5, 7);
		int lenght = 7;
		// short lenght = 7;
		drawSquare(lenght);
		drawSquare((short) 5);

	}

	/**
	 * Draws a rectangle out of asterisks (“*”) based on the given parameters
	 * 
	 * @param height
	 *        the height of the rectangle
	 * @param width
	 *        the width of the rectangle
	 */
	public static void drawFullShape(int height, int width) {

		for (int i = 1; i <= height; i++) {

			for (int j = 1; j <= width; j++) {

				System.out.print("* ");

			}

			System.out.println();

		}
	}

	public static void drawShapeOutline(int height, int width) {

		for (int i = 1; i <= height; i++) {

			for (int j = 1; j <= width; j++) {

				if (i == 1 || i == height || j == 1 || j == width) {

					System.out.print("*  ");

				} else {

					System.out.print("   ");

				}

			}

			System.out.println();
		}

	}

	public static void drawShapeCorners(int height, int width) {

		for (int i = 1; i <= height; i++) {

			for (int j = 1; j <= width; j++) {

				if (i == 1 && j == 1 || i == 1 && j == width || i == height && j == 1 || i == height && j == width) {

					System.out.print("*  ");

				} else {

					System.out.print("  ");

				}

			}

			System.out.println();
		}

	}

	public static void drawSquare(int lenght) {

		for (int i = 1; i <= lenght; i++) {

			for (int j = 1; j <= lenght; j++) {

				System.out.print("* ");

			}

			System.out.println();

		}
	}

	public static void drawSquare(short lenght) {

		for (int i = 1; i <= lenght; i++) {

			for (int j = 1; j <= lenght; j++) {

				System.out.print("# ");

			}

			System.out.println();

		}
	}
}