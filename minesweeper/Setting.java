package minesweeper;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Setting extends JFrame{
	
	public Setting() {
		
		setTitle("Setting");
		setResizable(false);
		setSize(240,120);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(3,1,1,1));
		JTextField n1 = new JTextField("����� ����");
		JTextField n2 = new JTextField("�ִ� ���� ������ ����");
		JButton send = new JButton("�Ϸ�");
		send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MineSweeper.size = Integer.parseInt(n1.getText());
				MineSweeper.totalmine = Integer.parseInt(n2.getText());
				MineSweeper.cntButton = MineSweeper.size*MineSweeper.size;
				dispose();
				new MineSweeper();
			}
		});
		c.add(n1);
		c.add(n2);
		c.add(send);
		setVisible(true);
		
		
	}
}
