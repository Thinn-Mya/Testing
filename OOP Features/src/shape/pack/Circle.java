package shape.pack;

public class Circle extends Shape {
	private double radius;
	private static final double PI = 3.14;
	
	public Circle(double radius, String color) {
		super(color);
		this.radius=radius;
	}
	public void area()
	{
		System.out.println(this.getColor() + " Circle Area is: " + PI*radius*radius);
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public static double getPi() {
		return PI;
	}

	
}
