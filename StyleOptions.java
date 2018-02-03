/******************************************************************************
 *
 * Name: Sally Carpenter
 * Course Number: SEIS601 - 01
 *
 * Description: Prints to the terminal window.
 * Program 6.13
 *****************************************************************************/
package sixth.assignment;

import javax.swing.JFrame;

public class StyleOptions {
	//creates and displays the style options frame.
	public static void main(String[]args) {
		JFrame frame = new JFrame("Style Options");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new StyleOptionsPanel());
		
		frame.pack();
		frame.setVisible(true);
		
	}

}
