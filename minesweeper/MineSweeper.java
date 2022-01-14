package minesweeper;

import java.awt.*;
import javax.swing.*;

public class MineSweeper extends JFrame {

	static JLabel info;
	static JLabel label;
	static int flag = 0;
	public final int WIDTH = 1280;
	public final int HEIGHT = 1024;
	public static int totalmine;
	public static int size;
	static int cntButton;

	
	public MineSweeper() {
		setTitle("Áö·ÚÃ£±â");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout(3, 3));
		c.setBackground(Color.BLACK);

		MinePanel MP = new MinePanel();
		c.add(MP, BorderLayout.CENTER);
		
		NorthPanel NP = new NorthPanel();
		c.add(NP, BorderLayout.NORTH);
		
		SouthPanel SP = new SouthPanel();
		c.add(SP, BorderLayout.SOUTH);
		
		setSize(WIDTH, HEIGHT);
		setResizable(true);
		setVisible(true);
	}

}
