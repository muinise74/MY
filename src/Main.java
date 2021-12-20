package 개인연습4;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

import java.awt.*;

public class Main{

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		JLabel label;
		
		frame.setTitle("연습");
		frame.setSize(1024,720);
		frame.setResizable(true);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel("연습",JLabel.CENTER);
		label.setFont(new Font("궁서",5,250));
		label.setForeground(Color.BLUE);
		frame.add(label);
	}

}
