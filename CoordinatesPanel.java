package sixth.assignment;
/******************************************************************************
*
* Name: Sally Carpenter
* Course Number: SEIS601 - 01
*
* Description: Prints to the terminal window.
* Program 6.19
*****************************************************************************/
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

//Represents the primary panel for the Coordinates program.
public class CoordinatesPanel extends JPanel {
	private final int SIZE = 6; // diameter of dot.
	private int x = 50, y = 50; // coordinates of mouse press.

	// Constructor: Sets up this panel to listen for mouse events.
	public CoordinatesPanel() {
		addMouseListener(new CoordinatesListener());

		setBackground(Color.black);
		setPreferredSize(new Dimension(300, 200));
	}

	// Draws all of the dots stored in the list.
	public void paintComponent(Graphics page) {
		super.paintComponent(page);
		page.setColor(Color.green);
		page.fillOval(x, y, SIZE, SIZE);
		page.drawString("Coordinates: (" + x + ", " + y + ")", 5, 15);
	}

	// Represents the mouse listener for mouse events.
	private class CoordinatesListener extends MouseAdapter {

		// Adds the current point to the list of points and redraws
		// the panel whenever the mouse button is pressed.
		public void mousePressed(MouseEvent event) {
			x = event.getX();
			y = event.getY();
			repaint();
		}

	}
}
