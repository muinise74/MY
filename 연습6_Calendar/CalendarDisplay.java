package ¿¬½À6_Calendar;

import javax.swing.*;
import java.awt.*;

public class CalendarDisplay extends JFrame{
	
	private final int height = 480;
	private final int width = 720;
	
	public CalaendarDisplay() {
		
		setTitle("Calendar");
		Container c = getContentPane();
		setSize(width,height);
		setResizable(false);
		setLayout(new BorderLayout(3,3));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
