package minesweeper;

import java.awt.*;
import javax.swing.*;

public class MineSweeper extends JFrame {

	static JLabel info;
	static JLabel label;
	static int cntButton = 900;
	public final int WIDTH = 1280;
	public final int HEIGHT = 1024;

	public MineSweeper() {
		setTitle("Áö·ÚÃ£±â");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout(5, 5));
		c.setBackground(Color.BLACK);

		MinePanel MP = new MinePanel();
		c.add(MP, BorderLayout.SOUTH);
		
		NorthPanel NP = new NorthPanel();
		c.add(NP, BorderLayout.EAST);
		
		setSize(WIDTH, HEIGHT);
		setResizable(false);
		setVisible(true);
	}

}
