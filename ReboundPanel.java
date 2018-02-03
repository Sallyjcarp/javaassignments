/******************************************************************************
 *
 * Name: Sally Carpenter
 * Course Number: SEIS601 - 01
 *
 * Description: Prints to the terminal window.
 * Program 6.16
 *****************************************************************************/
package sixth.assignment;

import java.awt.*;
import java.awt.event.*;
import java.sql.Time;

import javax.swing.*;

public class ReboundPanel extends JPanel {

	private final int WIDTH = 1500, HEIGHT = 600;
	private final int DELAY = 5, IMAGE_SIZE = 5;

	private ImageIcon image;
	private Timer timer;
	private int x, y, moveX, moveY;

	// Sets up the panel, including the timer for the animation;
	public ReboundPanel() {
		timer = new Timer(DELAY, new ReboundListener());
		addMouseListener(new CoordinatesListener());

		image = new ImageIcon(
				"C:\\Users\\carpe\\eclipse-workspace\\SEIS601P1\\src\\assignments\\resources\\smileface.gif");
		x = 0;
		y = 0;
		moveX = moveY = 3;

		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.black);

		timer.start();
	}

	// Draws the image in the current location.
	public void paintComponent(Graphics page) {
		super.paintComponent(page);
		image.paintIcon(this, page, x, y);
	}

	// Represents the action listener for the timer
	private class ReboundListener implements ActionListener {
		// Updates the position of the image and possibly the direction
		// of movement whenever the timer fires an action event.
		public void actionPerformed(ActionEvent event) {
			x += moveX;
			y += moveY;

			if (x <= 0 || x >= WIDTH - IMAGE_SIZE)
				moveX = moveX * -1;

			if (y <= 0 || y >= HEIGHT - IMAGE_SIZE)
				moveY = moveY * -1;
			repaint();
		}
	}

	private class CoordinatesListener extends MouseAdapter {
		private boolean b;

		public void mousePressed(MouseEvent event) {

		}

		@Override
		public void mouseClicked(MouseEvent event) {
			x = event.getX();
			y = event.getY();

			if (b) {
				timer.start();
			} else {
				timer.stop();
			}
			b = !b;

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
