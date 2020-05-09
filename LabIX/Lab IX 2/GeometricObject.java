/* 
 * Cassie Schaaf
 * Lab IX Geometric Objects, abstract classes and interfaces
 */

package labIX;

public abstract class GeometricObject implements Comparable<GeometricObject>{
	//instantiate variables
	private double area;
	
	//default constructor
	protected GeometricObject(){
	}
	
	//get area
	public double getArea() {
		return this.area;
	}
	
	//set area
	public void setArea(double area) {
		this.area = area;
	}
	
	//compareTo method
	public int compareTo(GeometricObject o1){
		if(getArea() > ((GeometricObject) o1).getArea()){
			return 1;
		} else if (getArea() < ((GeometricObject) o1).getArea()){
			return -1;
		} else {
			return 0;
		}
	}
		
	//max method
	public static Object max(GeometricObject o, GeometricObject o1){
		if (((GeometricObject) o).compareTo(o1) == 1){
			System.out.println(o + " is the larger object.");
			return o;
		} else if(((GeometricObject) o).compareTo(o1)==-1){
			System.out.println(o1 + " is the larger object.");
			return o1;
		} else {
			System.out.println("The objects are equal.");
			return o;
		}
	}
}
