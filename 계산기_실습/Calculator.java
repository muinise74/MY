package 계산기_실습;

import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame {


	static JLabel info;
	static JLabel label;
	static int flag = 0;
	static int check = 0;
	public final int WIDTH = 500;
	public final int HEIGHT = 600;

	public Calculator() {
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout(5, 5));
		c.setBackground(Color.BLACK);

		NorthPanel NP = new NorthPanel();
		c.add(NP, BorderLayout.EAST);

		CenterPanel CP = new CenterPanel();
		c.add(CP, BorderLayout.SOUTH);

		setSize(WIDTH, HEIGHT);
		setResizable(false);
		setVisible(true);
	}

}
