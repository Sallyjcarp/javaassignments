/******************************************************************************
 *
 * Name: Sally Carpenter
 * Course Number: SEIS601 - 01
 *
 * Description: Prints to the terminal window.
 * Program 6.20
 *****************************************************************************/
package sixth.assignment;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CarMoving {
	public static void main(String[] args) {
		JFrame frame = new JFrame("CarMoving");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new CarPanel());

		frame.pack();
		frame.setVisible(true);
	}
}
