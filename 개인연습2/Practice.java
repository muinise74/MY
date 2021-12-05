package 개인연습2;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
//import javax.swing.JOptionPane;

public class Practice {

	public JFrame frame;
	public JLabel label;
	String title;
	int width;
	int height;
	
	public Practice(String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;
	}
	
	public void createDisplay(String message) {
		label = new JLabel(message,JLabel.LEFT);
		label.setFont(new Font("Serif",0,40));
		frame = new JFrame(title);
		frame.setSize(width,height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(label);
		frame.setResizable(false);
		frame.setVisible(true);
	}
}