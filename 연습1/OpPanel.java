package 연습1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OpPanel extends JPanel {

	public OpPanel() {
		setBackground(Color.pink);
		setLayout(new GridLayout(1, 4, 5, 5));
		JButton btPlus = new JButton("+");
		btPlus.setFont(new Font("Serif", 0, 50));
		JButton btMinus = new JButton("-");
		btMinus.setFont(new Font("Serif", 0, 50));
		JButton btMul = new JButton("*");
		btMul.setFont(new Font("Serif", 0, 50));
		JButton btDiv = new JButton("/");
		btDiv.setFont(new Font("Serif", 0, 50));
		btPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btPlus) {
					cal2.result = cal2.num1 + cal2.num2;
					String str = "결과 : " + cal2.result;
					cal2.r.setText(str);
				}
			}
		});
		btMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btMinus) {
					cal2.result = cal2.num1 - cal2.num2;
					String str = "결과 : " + cal2.result;
					cal2.r.setText(str);
				}
			}
		});
		btMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btMul) {
					cal2.result = cal2.num1 * cal2.num2;
					String str = "결과 : " + cal2.result;
					cal2.r.setText(str);
				}
			}
		});
		btDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btDiv) {
					cal2.result = cal2.num1 / cal2.num2;
					String str = "결과 : " + cal2.result;
					cal2.r.setText(str);
				}
			}
		});
		add(btPlus);
		add(btMinus);
		add(btMul);
		add(btDiv);
	}
}
