/******************************************************************************
*
* Name: Sally Carpenter
* Course Number: SEIS601 - 01
*
* Description: Prints to the terminal window.
* Program 8.6
*****************************************************************************/
package eighth.assignment;

public class Cube extends ThreeDShape {
	private int side;

	public Cube(int Side) {
		this.side = Side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	void circumference() {
		int circumference = 4 * side;
		System.out.println("The circumference of the cube is: " + circumference);

	}

	@Override
	void area() {
		int area = 6 * side * side;
		System.out.println("The area of the cube is: " + area);

	}

	@Override
	void volume() {
		int volume = side * side * side;
		System.out.println("The volume of the cube is: " + volume);

	}

}
