package lab3Q4;

public class Circle {
	private double ridus;

	

	public Circle(double ridus) {

		this.ridus = ridus;

	}
	public double computeArea() {
		double arecicrcle=Math.PI*(ridus*ridus);
		
		return arecicrcle;
	}
	public double getRidus() {
		double r=ridus;
		return r;
	}
}
