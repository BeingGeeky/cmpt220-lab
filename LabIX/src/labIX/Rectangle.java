/* 
 * Cassie Schaaf
 * Lab IX Geometric Objects, abstract classes and interfaces
 */

package labIX;

public class Rectangle extends GeometricObject{
	//instantiate variables
	private double width;
	private double height;		

	//default contructor
	public Rectangle() {
		super();
	}

	//constructor
	public Rectangle(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}

	//get width
	public double getWidth() {
		return width;
	}

	//set width
	public void setWidth(double width) {
		this.width = width;
	}

	//get height
	public double getHeight() {
		return height;
	}

	//set height
	public void setHeight(double height) {
		this.height = height;
	}
	
	//get area
	public double getArea(){
		return width * height;
	}

	//set area
	@Override
	public void setArea(double area) {
		super.setArea(area);
	}

	//compareTo method
	@Override
	public int compareTo(GeometricObject o1) {
		return super.compareTo(o1);
	}

}
