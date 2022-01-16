package ¿¬½À5_2048;

import javax.swing.*;
import java.awt.*;

public class Game2048 extends JFrame {
	
	private static final int width = 480;
	private static final int height = 720;
	static JLabel[] labels = new JLabel[16];
	public Game2048() {
		
		setTitle("2048");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout(3,3));
		
		Container c = getContentPane();
		
		TitlePanel tp = new TitlePanel();
		c.add(tp, BorderLayout.NORTH);
		
		MainPanel mp = new MainPanel();
		c.add(mp, BorderLayout.CENTER);
		
		ButtonPanel bp = new ButtonPanel();
		c.add(bp, BorderLayout.SOUTH);
		
		setSize(width,height);
		setResizable(true);
		setVisible(true);
		
	}
	
}
