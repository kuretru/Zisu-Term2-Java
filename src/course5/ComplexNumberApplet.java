package course5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ComplexNumberApplet extends JApplet {
	private JTextField tfAReal;
	private JTextField tfAImage;
	private JTextField tfBReal;
	private JTextField tfBImage;

	public ComplexNumberApplet() {
		getContentPane().setLayout(null);

		JLabel lblResult = new JLabel("Result:");
		lblResult.setBounds(44, 234, 186, 18);
		getContentPane().add(lblResult);

		JLabel lblA = new JLabel("A:");
		lblA.setBounds(14, 88, 16, 18);
		getContentPane().add(lblA);

		tfAReal = new JTextField();
		tfAReal.setBounds(44, 85, 86, 24);
		getContentPane().add(tfAReal);
		tfAReal.setColumns(10);

		tfAImage = new JTextField();
		tfAImage.setBounds(144, 85, 86, 24);
		getContentPane().add(tfAImage);
		tfAImage.setColumns(10);

		JLabel lblAI = new JLabel("i");
		lblAI.setBounds(244, 88, 72, 18);
		getContentPane().add(lblAI);

		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a = Double.valueOf(tfAReal.getText());
				double b = Double.valueOf(tfAImage.getText());
				double c = Double.valueOf(tfBReal.getText());
				double d = Double.valueOf(tfBImage.getText());
				ComplexNumber A = new ComplexNumber(a, b);
				ComplexNumber B = new ComplexNumber(c, d);
				ComplexNumber C = A.complexAdd(B);
				lblResult.setText(C.toString());
			}
		});
		btnAdd.setBounds(28, 123, 40, 40);
		getContentPane().add(btnAdd);

		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.valueOf(tfAReal.getText());
				double b = Double.valueOf(tfAImage.getText());
				double c = Double.valueOf(tfBReal.getText());
				double d = Double.valueOf(tfBImage.getText());
				ComplexNumber A = new ComplexNumber(a, b);
				ComplexNumber B = new ComplexNumber(c, d);
				ComplexNumber C = A.complexMinus(B);
				lblResult.setText(C.toString());
			}
		});
		btnMinus.setBounds(82, 122, 40, 40);
		getContentPane().add(btnMinus);

		JButton btnMulti = new JButton("*");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.valueOf(tfAReal.getText());
				double b = Double.valueOf(tfAImage.getText());
				double c = Double.valueOf(tfBReal.getText());
				double d = Double.valueOf(tfBImage.getText());
				ComplexNumber A = new ComplexNumber(a, b);
				ComplexNumber B = new ComplexNumber(c, d);
				ComplexNumber C = A.complexMulti(B);
				lblResult.setText(C.toString());
			}
		});
		btnMulti.setBounds(136, 122, 40, 40);
		getContentPane().add(btnMulti);

		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.valueOf(tfAReal.getText());
				double b = Double.valueOf(tfAImage.getText());
				double c = Double.valueOf(tfBReal.getText());
				double d = Double.valueOf(tfBImage.getText());
				ComplexNumber A = new ComplexNumber(a, b);
				ComplexNumber B = new ComplexNumber(c, d);
				ComplexNumber C = A.complexDiv(B);
				lblResult.setText(C.toString());
			}
		});
		btnDiv.setBounds(190, 122, 40, 40);
		getContentPane().add(btnDiv);

		JLabel lblB = new JLabel("B:");
		lblB.setBounds(14, 179, 16, 18);
		getContentPane().add(lblB);

		tfBReal = new JTextField();
		tfBReal.setColumns(10);
		tfBReal.setBounds(44, 176, 86, 24);
		getContentPane().add(tfBReal);

		tfBImage = new JTextField();
		tfBImage.setColumns(10);
		tfBImage.setBounds(144, 176, 86, 24);
		getContentPane().add(tfBImage);

		JLabel lblBI = new JLabel("i");
		lblBI.setBounds(244, 179, 72, 18);
		getContentPane().add(lblBI);

	}
}
