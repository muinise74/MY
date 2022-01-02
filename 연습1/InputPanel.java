package ¿¬½À1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InputPanel extends JPanel {

	public InputPanel() {
		setBackground(Color.pink);
		setLayout(new GridLayout(2, 1, 5, 5));
		cal2.n1.setFont(new Font("±Ã¼­",0,20));
		cal2.n2.setFont(new Font("±Ã¼­",0,20));
		cal2.n1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() ==cal2.n1) {
					cal2.num1 = Float.parseFloat(cal2.n1.getText());
				}
			}
		});
		cal2.n2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == cal2.n2) {
					cal2.num2 = Float.parseFloat(cal2.n2.getText());
				}
			}
		});
		add(cal2.n1);
		add(cal2.n2);
	}
}
