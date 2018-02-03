/******************************************************************************
*
* Name: Sally Carpenter
* Course Number: SEIS601 - 01
*
* Description: Prints to the terminal window.
* Program 8.6
*****************************************************************************/
package eighth.assignment;

import java.text.DecimalFormat;

public class Sphere extends ThreeDShape {
	private int radius;

	public Sphere(int Radius) {
		this.radius = Radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	void circumference() {
		DecimalFormat dm = new DecimalFormat("0.###");
		double circm = 2 * Math.PI * radius;
		String circmVal = dm.format(circm);
		System.out.println("The circumference of the sphere is: " + circmVal);

	}

	@Override
	void area() {
		DecimalFormat dm = new DecimalFormat("0.###");
		double ar = 4 * Math.PI * radius * radius;
		String arVal = dm.format(ar);
		System.out.println("The area of the sphere is: " + arVal);
	}

	@Override
	void volume() {
		DecimalFormat dm = new DecimalFormat("0.###");
		double vol = 4 * Math.PI * radius * radius * radius / 3;
		String volVal = dm.format(vol);
		System.out.println("The volume of the sphere is:" + volVal);

	}

}
