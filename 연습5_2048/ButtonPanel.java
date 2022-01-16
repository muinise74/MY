package ¿¬½À5_2048;

import javax.swing.*;
import java.awt.*;

public class ButtonPanel extends JPanel{
	
	public ButtonPanel() {
		
		setLayout(new GridLayout(1,4,5,5));
		
		JButton up = new JButton("¡è");
		JButton down = new JButton("¡é");
		JButton left = new JButton("¡ç");
		JButton right = new JButton("¡æ");
		
		up.setFont(new Font("Serif",Font.BOLD,40));
		down.setFont(new Font("Serif",Font.BOLD,40));
		left.setFont(new Font("Serif",Font.BOLD,40));
		right.setFont(new Font("Serif",Font.BOLD,40));
		
		up.addActionListener(new UpListener());
		down.addActionListener(new DownListener());
		left.addActionListener(new LeftListener());
		right.addActionListener(new RightListener());
		
		add(up);
		add(down);
		add(left);
		add(right);
	}
	
}
