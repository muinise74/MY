package ¿¬½À1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ResultPanel extends JPanel {

	public ResultPanel() {
		setBackground(Color.PINK);
		setLayout(new GridLayout(2, 1, 5, 5));
		cal2.r.setFont(new Font("San Serif", 0, 50));
		add(cal2.r);
		JButton send = new JButton("Send");
		send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					cal2.num1 = cal2.result;
					cal2.n1.setText(""+cal2.result);
			}
			
		});
		add(send);
	}
}
