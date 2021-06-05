package automation.oop1;

public class Rectangle extends Shape {

	private int largeSide;
	private int smallSide;

	public int getLargeSide() {
		return largeSide;
	}

	public void setLargeSide(int largeSide) {
		if (largeSide > 0) {
			this.largeSide = largeSide;
		}
	}

	public int getSmallSide() {
		return smallSide;
	}

	public void setSmallSide(int smallSide) {
		if (smallSide > 0) {
			this.smallSide = smallSide;
		}
	}

	public double getArea() {
		return smallSide * largeSide;
	}
}
