/******************************************************************************
 *
 * Name: Sally Carpenter
 * Course Number: SEIS601 - 01
 *
 * Description: Prints to the terminal window.
 * Program 6.18
 *****************************************************************************/
package sixth.assignment;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.AudioClip;
import java.net.URL;

//Represents the control panel for the juke box.

public class JukeBoxControls extends JPanel {
	private JComboBox musicCombo;
	private JButton stopButton, playButton;
	private AudioClip[] music;
	private AudioClip current;

	// Sets up the GUI for the juke box.

	public JukeBoxControls() {
		URL url1, url2, url3, url4, url5, url6;
		url1 = url2 = url3 = url4 = url5 = url6 = null;

		// Obtain and store the audio clips to play
		try {
			url1 = new URL("file", "localhost", "westernBeat.wav");
			url2 = new URL("file", "localhost", "classical.wav");
			url3 = new URL("file", "localhost", "jeaopardy.au");
			url4 = new URL("file", "localhost", "newAgeRhythm.wav");
			url5 = new URL("file", "localhost", "eightiesJam.wav");
			url6 = new URL("file", "localhost", "hitchcock.wav");
		} catch (Exception exception) {
		}

		music = new AudioClip[7];
		music[0] = null; // Corresponds to "Make a Selection..."
		music[1] = JApplet.newAudioClip(url1);
		music[2] = JApplet.newAudioClip(url2);
		music[3] = JApplet.newAudioClip(url3);
		music[4] = JApplet.newAudioClip(url4);
		music[5] = JApplet.newAudioClip(url5);
		music[6] = JApplet.newAudioClip(url6);

		// Create the list of strings for the combo box options
		String[] musicNames = { "Make a Selection...", "Western Beat", "Classical Melody", "Jeopardy Theme",
				"New Age Rhythm", "Eighties Jam", "Alfred Hitchcock's Theme" };

		musicCombo = new JComboBox(musicNames);
		musicCombo.setBackground(Color.white);

		// Set up the buttons
		playButton = new JButton(" PLAY ", new ImageIcon(" play.gif "));
		playButton.setMnemonic('C');
		playButton.setBackground(Color.white);
		stopButton = new JButton("STOP", new ImageIcon("stop.gif"));
		stopButton.setMnemonic('B');
		stopButton.setBackground(Color.white);

		// Set up this panel
		setPreferredSize(new Dimension(250, 100));
		setBackground(Color.cyan);
		add(musicCombo);
		add(playButton);
		add(stopButton);

		musicCombo.addActionListener(new ComboListener());
		stopButton.addActionListener(new ButtonListener());
		playButton.addActionListener(new ButtonListener());

		current = null;
	}

	// Represents the action listener for the combo box.

	private class ComboListener implements ActionListener {
		// Stops playing the current selection (if any) and resets
		// the current selection to the one chosen.

		public void actionPerformed(ActionEvent event) {
			if (current != null)
				current.stop();
			current = music[musicCombo.getSelectedIndex()];
		}
	}

	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (current != null)
				current.stop();

			if (event.getSource() == playButton)
				if (current != null)
					current.play();
		}

	}

}
