/******************************************************************************
*
* Name: Sally Carpenter
* Course Number: SEIS601 - 01
*
* Description: Prints to the terminal window.
* Program 8.6
*****************************************************************************/
package eighth.assignment;

public class ThreeDShapeDriver {

	public static void main(String[] args) {
		Cube cu = new Cube(10);
		System.out.println("The side of the cube is: " + cu.getSide());
		cu.circumference();
		cu.area();
		cu.volume();
		System.out.println();
		Sphere sp = new Sphere(10);
		System.out.println("The radius of the sphere is: " + sp.getRadius());
		sp.circumference();
		sp.area();
		sp.volume();

	}

}
