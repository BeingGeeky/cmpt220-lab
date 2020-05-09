/* 
 * Cassie Schaaf
 * Lab IX Geometric Objects, abstract classes and interfaces
 */

package labIX;

public class Circle extends GeometricObject{
	//instantiate variables 
	private double radius;

	//default constructor
	public Circle() {
		super();
	}
	
	//constructor
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	//get radius
	public double getRadius() {
		return radius;
	}
	
	//set radius
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	//get area
	public double getArea(){
		return radius * radius * Math.PI;
	}

	//setArea
	@Override
	public void setArea(double area) {
		// TODO Auto-generated method stub
		super.setArea(area);
	}

	//compareTo method
	@Override
	public int compareTo(GeometricObject o1) {
		// TODO Auto-generated method stub
		return super.compareTo(o1);
	}
	
}
