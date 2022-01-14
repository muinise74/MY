package minesweeper;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SouthPanel extends JPanel{
	
	public SouthPanel() {
		setBackground(Color.BLACK);
		setLayout(new GridLayout(1, 2, 1, 1));
		JButton exit = new JButton("Exit");
		JButton restart = new JButton("Restart");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		restart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		add(exit);
		add(restart);
	}
}
