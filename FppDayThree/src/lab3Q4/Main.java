package lab3Q4;

public class Main {
	public static void main(String []args) {
		// TODO Auto-generated constructor stub
		Triangle tr = new Triangle(100, 8.7);
		Triangle tr1= new Triangle(12,5,8);
		Rectangle rec = new Rectangle(12.1, 8.5);
		Circle crs = new Circle(4);

		System.out.println("Area of Triangle =>"+ tr.computeArea());
		System.out.println("Area of Triangle After modification =>"+ tr1.computeArea());
		System.out.println("Area of Rectangle =>" +rec.computeArea());
		System.out.println("Area of Circle =>" +crs.computeArea());
	}
}
