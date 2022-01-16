package ����5_2048;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.Random;

public class MainPanel extends JPanel {
	
	private LineBorder bd = new LineBorder(Color.BLACK,2,false);
	
	public MainPanel() {
		
		setLayout(new GridLayout(4,4,5,5));
		setBackground(Color.WHITE);
		
		for (int i = 0; i < Game2048.labels.length; i++) {
			Game2048.labels[i] = new JLabel();
			Game2048.labels[i].setText("");
			Game2048.labels[i].setFont(new Font("����",Font.BOLD,30));
			Game2048.labels[i].setBackground(Color.WHITE);
			Game2048.labels[i].setForeground(Color.BLACK);
			// JLabel ���� : ���� horizontal, ���� vertical
			Game2048.labels[i].setHorizontalAlignment(JLabel.CENTER);
			Game2048.labels[i].setVerticalAlignment(JLabel.CENTER);
			// �׵θ� �����
			Game2048.labels[i].setBorder(bd);
			add(Game2048.labels[i]);
		}
		
		Random rd = new Random();
		int rand = rd.nextInt(16);
		
		Game2048.labels[rand].setText("2");
		
	}
}