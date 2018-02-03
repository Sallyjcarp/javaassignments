package sixth.assignment;

//Demonstrates the use of check boxes.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StyleOptionsPanel extends JPanel {
	private JLabel saying, inputLabel;
	private JCheckBox bold, italic;
	private JTextField textSize;
	// Sets up a panel with a label and some check boxes that control the style of
	// the label's font.

	public StyleOptionsPanel() {
		saying = new JLabel("Saying it with style!");
		saying.setFont(new Font("Helvetica", Font.PLAIN, 36));

		bold = new JCheckBox("Bold");
		bold.setBackground(Color.cyan);
		italic = new JCheckBox("Italic");
		italic.setBackground(Color.cyan);
		inputLabel = new JLabel("Enter the font size");
		inputLabel.setBackground(Color.cyan);
		textSize = new JTextField(2);

		StyleListener styl = new StyleListener();
		ActListner actl = new ActListner();
		bold.addItemListener(styl);
		italic.addItemListener(styl);
		textSize.addActionListener((ActionListener) actl);

		add(saying);
		add(bold);
		add(italic);
		add(inputLabel);
		add(textSize);

		setBackground(Color.cyan);
		setPreferredSize(new Dimension(300, 100));

	}

	// Represents the listener for both check boxes.

	private class StyleListener implements ItemListener {
		// Updates the style of the label font style.
		public void itemStateChanged(ItemEvent event) {
			int style = Font.PLAIN;

			if (bold.isSelected())
				style = Font.BOLD;

			if (italic.isSelected())
				style += Font.ITALIC;

			String text = textSize.getText();
			int s = Integer.parseInt(text);
			saying.setFont(new Font("Helvetica", style, s));
		}
	}

	class ActListner implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int style = Font.PLAIN;

			if (bold.isSelected())
				style = Font.BOLD;

			if (italic.isSelected())
				style += Font.ITALIC;

			String text = textSize.getText();
			int s = Integer.parseInt(text);
			saying.setFont(new Font("Helvetica", style, s));

		}

	}

}
