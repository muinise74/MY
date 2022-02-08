package ¿¬½À6_Calendar;

import javax.swing.*;
import java.awt.*;

public class CalendarDisplay extends JFrame{
	
	private final int height = 480;
	private final int width = 720;
	static int year;
	static int month;
	static DatePanel dp = new DatePanel();
	
	public CalendarDisplay() {
		// 닐찌 화면
		setTitle("Calendar");
		Container c = getContentPane();
		setSize(width,height);
		setResizable(true);
		setLayout(new BorderLayout(3,3));
		
		MonthPanel mp = new MonthPanel();
		c.add(mp,BorderLayout.NORTH);
		dp.DatePanelSet();
		c.add(dp,BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
