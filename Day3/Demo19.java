package Day3;

/**
 * Abstraction Real time demo
 *
 * Shape: Rectangle, Square, Circle, Cone
 * Dim: Length, Height, Radius, Pie
 *
 */

public class Demo19 { 
	public static void main (String[] args) {
		
		Rectangle rectangle = new Rectangle(20.02, 40.30);
		Circle cirle = new Circle(55.50);
		rectangle.draw();
		double rec =rectangle.getArea();
		System.out.println(rec);
		cirle.draw();
		double cir = cirle.getArea();
		System.out.println(cir);
		
}

}
 abstract class Shape{
	public double length;
	public double width;
	public double radius;
	public double pie=3.17f;
	
	public abstract double getArea();
}

class Rectangle extends Shape{
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public void draw() {
		System.out.println("Rectangle drawing...");
	}
	@Override
	public double getArea() {
		return (length * width);
	}
}
class Circle extends Shape{
	public Circle (double radius) {
		this.radius = radius;
	}
	public void draw() {
		System.out.println("Circle drawing...");
	}
	@Override
	public double getArea() {
		return (pie * radius * radius);
	}
}
