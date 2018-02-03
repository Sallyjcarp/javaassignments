/******************************************************************************
 *
 * Name: Sally Carpenter
 * Course Number: SEIS601 - 01
 *
 * Description: Prints to the terminal window.
 * Program 6.18
 *****************************************************************************/
package sixth.assignment;

import javax.swing.*;

public class JukeBox {
	
	//Creates and displays the controls for a juke box.
	public static void main(String[]args) {
		JFrame frame = new JFrame("Java Juke Box");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new JukeBoxControls());
		
		frame.pack();
		frame.setVisible(true);
	}

}
