package SDET_Training;

public abstract class Shape {
	
	public abstract double calculateArea();

}

class Circle extends Shape{
	@Override
	public double calculateArea() {
		double r=5.0;
		double area=3.14*r*r;	
		return area;
	}
	
}

class Square extends Shape{
	@Override
	public double calculateArea() {
		int length = 0, breadth = 0;
		double area=length*breadth;
		return area;
	}
}
