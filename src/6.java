
public class SchoolSciences {
	
	// method to calculate the area of a rectangle
	public static double getRectangleArea(double width, double height) {
		return width * height;
	}
	
	// method to calculate the perimeter of a rectangle
	public static double getRectanglePerimeter(double width, double height) {
		return 2 * (width + height);
	}
	
	// method to calculate the area of a circle
	public static double getCircleArea(double radius) {
		return Math.PI * radius * radius;
	}
	
	// method to calculate the circumference of a circle
	public static double getCircleCircumference(double radius) {
		return 2 * Math.PI * radius;
	}
	
	// main method
	public static void main(String[] args) {
		System.out.println("Rectangle:");
		System.out.println("Area: " + getRectangleArea(5, 3));
		System.out.println("Perimeter: " + getRectanglePerimeter(5, 3));
		
		System.out.println("\nCircle:");
		System.out.println("Area: " + getCircleArea(5));
		System.out.println("Circumference: " + getCircleCircumference(5));
	}
}