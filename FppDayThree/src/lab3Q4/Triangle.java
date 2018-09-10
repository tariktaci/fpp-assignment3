package lab3Q4;

public final class Triangle {
	private double height;
	private double base;
	private double side1;
	private double side2;
	private double side3;

	public Triangle(double height, double base) {

		 side1=height;
		side2 = base;
		side3 = Math.sqrt(base * base + height * height);

		setbaseHeight(side1, side2, side3);
	}

	public Triangle(double side1, double side2, double side3) {
		setbaseHeight(side1, side2, side3);
	}

	private void setbaseHeight(double side1, double side2, double side3) {
		base = side1;
		if (base < side2) {
			base = side2;
		}
		if (base < side3) {
			base = side3;
		}
		System.out.println("the base of the three side" + base);
		double s = (side1 + side2 + side3) / 2;
		double areside = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

		this.height = areside / 0.5 * base;

	}

	public double computeArea() {
		double areTr = 0.5 * base * height;
		return areTr;
	}

	public double getHeight() {
		return height;
	}

	public double getBase() {
		return base;
	}

}
