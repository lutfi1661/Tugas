package E2;

public class Main {
	public static void main(String[] args) {
		Shape s = new Shape();
		System.out.print(s.toString() + "\n");
		
		Circle c1 = new Circle(7, "red", false);
		System.out.println("Circle : \n"
				+ "radius = " + c1.getRadius()
				+ ", perimeter = " + c1.getPerimeter()
				+ ", area = " + c1.getArea()
				+ ", text = " + c1.toString()
				);
		
		Rectangle r1 = new Rectangle();
		System.out.println("Rectangle : \n"
				+ "width = " + r1.getWidth()
				+ ", length = " + r1.getLength()
				+ ", perimeter = " + r1.getPerimeter()
				+ ", area = " + r1.getArea()
				+ ", text = " + r1.toString()
				);
		
		Square s1 = new Square();
		System.out.println("Square : \n"
				+ "side = " + s1.getSide()
				+ ", perimeter = " + s1.getPerimeter()
				+ ", area = " + s1.getArea()
				+ ", text = " + s1.toString()
				);
		
	}
}
