package course2;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class SimpleGraphicsInOut extends Applet implements ActionListener {
	private static final long serialVersionUID = 1L;
	Label prompt;
	TextField input;
	Label output;

	public void init() {
		prompt = new Label("Enter a character please:");
		input = new TextField("asdadasd", 6);
		output = new Label("         ");
		add(prompt);
		add(input);
		add(output);
		input.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		output.setText("You've entered character:" + input.getText());
	}
}
