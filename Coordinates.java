/******************************************************************************
 *
 * Name: Sally Carpenter
 * Course Number: SEIS601 - 01
 *
 * Description: Prints to the terminal window.
 * Program 6.19
 *****************************************************************************/
package sixth.assignment;

import javax.swing.JFrame;

public class Coordinates {
	//Creates and displays the application frame.
	public static void main(String[]args) {
		JFrame frame = new JFrame("Coordinates");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new CoordinatesPanel());
		
		frame.pack();
		frame.setVisible(true);
	}

}
