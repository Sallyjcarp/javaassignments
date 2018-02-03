/******************************************************************************
 *
 * Name: Sally Carpenter
 * Course Number: SEIS601 - 01
 *
 * Description: Prints to the terminal window.
 * Program 6.20
 *****************************************************************************/
package sixth.assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Represents the primary display panel for the Car Moving program.
public class CarPanel extends JPanel {
	private final int WIDTH = 1000, HEIGHT = 700;
	private final int DELAY = 20, IMAGE_SIZE = 5;

	private ImageIcon image;
	private Timer timer;
	private int x, y, moveX, moveY;

	// Sets up the panel, including the timer for the animation.
	public CarPanel() {
		timer = new Timer(DELAY, new CarListener());

		image = new ImageIcon(
				"C:\\Users\\carpe\\eclipse-workspace\\SEIS601P1\\src\\assignments\\resources\\carView.gif");
		x = 0;
		y = 0;
		moveX = 3;
		moveY = 0;

		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.white);

		timer.start();
	}

	// Draws the image in the paint component.
	public void paintComponent(Graphics page) {
		super.paintComponent(page);
		image.paintIcon(this, page, x, y);
	}

	// Represents the action listener for the timer.
	private class CarListener implements ActionListener {
		// Updates the position of the image and possibly the direction
		// of movement whenever the timer fires an action event.
		public void actionPerformed(ActionEvent event) {
			x += moveX;
			y += moveY;

			if (x >= 0 || x >= WIDTH - IMAGE_SIZE)
				moveX = moveX * +1;

			if (y <= 0 || y >= HEIGHT - IMAGE_SIZE)
				moveY = moveY * 0;
			repaint();
		}
	}

}
