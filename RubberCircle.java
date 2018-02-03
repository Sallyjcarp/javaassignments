/******************************************************************************
*
* Name: Sally Carpenter
* Course Number: SEIS601 - 01
*
* Description: Prints to the terminal window.
* Program 6.12
*****************************************************************************/
package sixth.assignment;
import javax.swing.JFrame;

public class RubberCircle {
	public static void main(String[]args) {
		JFrame frame = new JFrame("Rubber Circle");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new RubberOvalPanel());
		
		frame.pack();
		frame.setVisible(true);
		
	}

}
