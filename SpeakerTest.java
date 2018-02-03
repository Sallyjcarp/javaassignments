/******************************************************************************
*
* Name: Sally Carpenter
* Course Number: SEIS601 - 01
*
* Description: Prints to the terminal window.
* Program 9.5
*****************************************************************************/
package ninthfive.assignment;

public class SpeakerTest {
	// Driver class instantiates Teacher, Doctor, and Soldier classes
	public static void main(String[] args) {

		Speaker spk1 = new Teacher();
		spk1.speak();
		Speaker spk2 = new Doctor();
		spk2.speak();
		Speaker spk3 = new Soldier();
		spk3.speak();

	}

}
