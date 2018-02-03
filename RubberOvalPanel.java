/******************************************************************************
*
* Name: Sally Carpenter
* Course Number: SEIS601 - 01
*
* Description: Prints to the terminal window.
* Program 6.12
*****************************************************************************/
package sixth.assignment;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

//Represents the primary drawing for the RubberCircle program.

public class RubberOvalPanel extends JPanel {
	private Point point1 = null, point2 = null;

	// Constructor sets up this panel to listen for mouse events.
	public RubberOvalPanel() {
		OvalListener listener = new OvalListener();
		addMouseListener(listener);
		addMouseMotionListener(listener);

		setBackground(Color.black);
		setPreferredSize(new Dimension(400, 200));
	}

	// Draws the current circle from the initial mouse-pressed point to the current
	// position of the mouse.
	public void paintComponent(Graphics page) {
		super.paintComponent(page);

		page.setColor(Color.yellow);
		if (point1 != null && point2 != null)
			page.drawOval(point1.x, point1.y, point2.x, point2.y);
	}

	// Represents the listener for all mouse events.
	private class OvalListener implements MouseListener, MouseMotionListener {

		// Captures the initial position at which the mouse button
		// is pressed.
		public void mousePressed(MouseEvent event) {
			point1 = event.getPoint();
		}

		// Gets the current position of the mouse as it is dragged
		// and redraws the line to create the rubberband effect.
		public void mouseDragged(MouseEvent event) {
			point2 = event.getPoint();
			repaint();
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

	}

}
