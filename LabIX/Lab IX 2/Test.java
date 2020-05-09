/* 
 * Cassie Schaaf
 * Lab IX Geometric Objects, abstract classes and interfaces
 */

package labIX;

public class Test {

	public static void main(String[] args) {
		// Create two comparable circles
		Circle circle1 = new Circle(5.0);	
		Circle circle2 = new Circle(4);

		//print circle variables
		System.out.println("Circle1 ("+ circle1 +") radius is " + circle1.getRadius());
		System.out.println("Circle2 ("+ circle2 +") radius is " + circle2.getRadius());

		//compare circles
		Circle.max(circle1, circle2);
		
		// Create two comparable rectangles
		Rectangle rectangle1 = new Rectangle(5.0,9.0);	
		Rectangle rectangle2 = new Rectangle(4.0,5.9);

		//print rectangle comparison variable
		System.out.println("Rectangle1 (" + rectangle1 + ") area is " + rectangle1.getArea());
		System.out.println("Rectangle2 (" + rectangle2 + ") area is " + rectangle2.getArea());

		//compare rectangles
		Rectangle.max(rectangle1, rectangle2);
	}
}

