package course3;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Task4 extends JApplet {
	private static final long serialVersionUID = 1L;
	private JTextField tfInput;

	public Task4() {
		getContentPane().setLayout(null);

		JLabel lblInput = new JLabel("\u8BF7\u8F93\u5165\u4E00\u4E2A\u6B63\u6574\u6570");
		lblInput.setForeground(Color.BLUE);
		lblInput.setBounds(14, 76, 130, 18);
		getContentPane().add(lblInput);

		JLabel lblTip = new JLabel("");
		lblTip.setBounds(46, 172, 297, 18);
		getContentPane().add(lblTip);

		tfInput = new JTextField();
		tfInput.setBounds(144, 73, 113, 24);
		getContentPane().add(tfInput);
		tfInput.setColumns(10);

		JButton btnOK = new JButton("\u786E\u5B9A");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int n = 0, r = 1;
				n = Integer.parseInt(tfInput.getText());
				for (int i = 1; i <= n; i++)
					r *= i;
				lblTip.setText(n + "µÄ½×³ËÎª£º" + r);
			}
		});
		btnOK.setBounds(271, 72, 113, 27);
		getContentPane().add(btnOK);

	}
}
