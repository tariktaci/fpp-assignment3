package lab3Q4;

public final  class Rectangle {
private double length;
private double wedth;
public Rectangle(double length, double wedth) {
	
	this.length = length;
	this.wedth = wedth;
}
public double computeArea() {
	double areRec= length*wedth;
	return areRec;
}
public double getLength() {
	double l=length;
	return l;
}
public double getWedth() {
	double w=wedth;
	return w;
}
}
