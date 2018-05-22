package course4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Range {
	private int lower = 0;
	private int upper = 0;

	public Range(int lower, int upper) {
		this.lower = lower;
		this.upper = upper;
	}

	public int getLower() {
		return lower;
	}

	public void setLower(int lower) {
		this.lower = lower;
	}

	public int getUpper() {
		return upper;
	}

	public void setUpper(int upper) {
		this.upper = upper;
	}

	private static boolean isPrime(int n) {
		int end = (int) Math.sqrt(n);
		for (int i = 2; i <= end; i++)
			if (n % i == 0)
				return false;
		return n > 1;
	}

	public static int[] getPrimeList(Range range) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = range.lower + 1; i < range.upper; i++)
			if (isPrime(i))
				list.add(i);
		int[] result = new int[list.size()];
		for (int i = 0; i < list.size(); i++)
			result[i] = list.get(i);
		return result;
	}

	public static String arrayToString(int[] data) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < data.length; i++)
			stringBuilder.append(data[i] + " ");
		return stringBuilder.toString();
	}
}

public class RangeApplet extends JApplet {
	private JTextField tfLower;
	private JTextField tfUpper;

	public RangeApplet() {
		getContentPane().setLayout(null);

		JLabel lblLower = new JLabel("下限");
		lblLower.setBounds(14, 87, 72, 18);
		getContentPane().add(lblLower);

		tfLower = new JTextField();
		tfLower.setBounds(110, 84, 86, 24);
		getContentPane().add(tfLower);
		tfLower.setColumns(10);

		JLabel lblUpper = new JLabel("上限");
		lblUpper.setBounds(221, 87, 72, 18);
		getContentPane().add(lblUpper);

		tfUpper = new JTextField();
		tfUpper.setBounds(307, 84, 86, 24);
		getContentPane().add(tfUpper);
		tfUpper.setColumns(10);

		JLabel lblResult = new JLabel("");
		lblResult.setBounds(14, 230, 379, 18);
		getContentPane().add(lblResult);

		JButton btnGo = new JButton("确定");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int lower = Integer.parseInt(tfLower.getText());
				int upper = Integer.parseInt(tfUpper.getText());
				Range range = new Range(lower, upper);
				int[] list = Range.getPrimeList(range);
				lblResult.setText(Range.arrayToString(list));
			}
		});
		btnGo.setBounds(151, 156, 113, 27);
		getContentPane().add(btnGo);

	}

}
