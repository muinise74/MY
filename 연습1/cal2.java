package ����1;

import javax.swing.*;
import java.awt.*;

public class cal2 {
	
	private static final int height = 360;
	private static final int width = 480;
	public static float num1;
	public static float num2;
	public static float result;
	public static JLabel r = new JLabel();
	public static JTextField n1 = new JTextField("ù ��° ���� �Է��Ͻð� Enter�� ���� �ּ���.");
	public static JTextField n2 = new JTextField("�� ��° ���� �Է��Ͻð� Enter�� ���� �ּ���.");
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setTitle("Calculator");
		frame.setSize(width,height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);

		Container c = frame.getContentPane();
		c.setLayout(new GridLayout(3,1,10,10));
		c.setBackground(Color.pink);
		
		InputPanel ip = new InputPanel();
		c.add(ip);
		
		OpPanel op = new OpPanel();
		c.add(op);
		
		ResultPanel rp = new ResultPanel();
		c.add(rp);
		
		frame.setVisible(true);
	}

}
