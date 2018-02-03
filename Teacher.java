/******************************************************************************
*
* Name: Sally Carpenter
* Course Number: SEIS601 - 01
*
* Description: Prints to the terminal window.
* Program 9.5
*****************************************************************************/
package ninthfive.assignment;

public class Teacher implements Speaker{
	String Speech;

	public String getSpeach() {
		return Speech;
	}

	public void setSpeach(String speech) {
		Speech = speech;
	}

	@Override
	public void speak() {
		System.out.println("Teacher Speak!");
	}

}
