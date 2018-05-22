package course5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CuboidApplet extends JApplet {
	private JTextField tfLength;
	private JTextField tfWidth;
	private JTextField tfHeight;

	/**
	 * Create the applet.
	 */
	public CuboidApplet() {
		getContentPane().setLayout(null);

		JLabel lblLength = new JLabel("\u957F");
		lblLength.setBounds(14, 70, 72, 18);
		getContentPane().add(lblLength);

		tfLength = new JTextField();
		tfLength.setBounds(100, 67, 86, 24);
		getContentPane().add(tfLength);
		tfLength.setColumns(10);

		JLabel lblWidth = new JLabel("\u5BBD");
		lblWidth.setBounds(14, 107, 72, 18);
		getContentPane().add(lblWidth);

		tfWidth = new JTextField();
		tfWidth.setBounds(100, 104, 86, 24);
		getContentPane().add(tfWidth);
		tfWidth.setColumns(10);

		JLabel lblHeight = new JLabel("\u9AD8");
		lblHeight.setBounds(14, 144, 72, 18);
		getContentPane().add(lblHeight);

		tfHeight = new JTextField();
		tfHeight.setBounds(100, 141, 86, 24);
		getContentPane().add(tfHeight);
		tfHeight.setColumns(10);

		JLabel lblResult = new JLabel("Result:");
		lblResult.setBounds(14, 204, 72, 18);
		getContentPane().add(lblResult);

		JButton btn1 = new JButton("\u5468\u957F");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float length = Float.valueOf(tfLength.getText());
				float width = Float.valueOf(tfWidth.getText());
				float height = Float.valueOf(tfHeight.getText());
				Cuboid cuboid = new Cuboid(length, width, height);
				lblResult.setText(String.valueOf(cuboid.perimeter()));
			}
		});
		btn1.setBounds(200, 66, 113, 27);
		getContentPane().add(btn1);

		JButton btn2 = new JButton("\u8868\u9762\u79EF");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float length = Float.valueOf(tfLength.getText());
				float width = Float.valueOf(tfWidth.getText());
				float height = Float.valueOf(tfHeight.getText());
				Cuboid cuboid = new Cuboid(length, width, height);
				lblResult.setText(String.valueOf(cuboid.acreage()));
			}
		});
		btn2.setBounds(200, 103, 113, 27);
		getContentPane().add(btn2);

		JButton btn3 = new JButton("\u4F53\u79EF");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float length = Float.valueOf(tfLength.getText());
				float width = Float.valueOf(tfWidth.getText());
				float height = Float.valueOf(tfHeight.getText());
				Cuboid cuboid = new Cuboid(length, width, height);
				lblResult.setText(String.valueOf(cuboid.volume()));
			}
		});
		btn3.setBounds(200, 140, 113, 27);
		getContentPane().add(btn3);

	}

}
