package ¿¬½À6_Calendar;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class DatePanel extends JPanel {
	
	private JLabel[] date = new JLabel[42];
	Calendar cal = Calendar.getInstance();
	
	public void DatePanelSet() {
		
		setLayout(new GridLayout(7,7,5,5));
		JLabel[] days = new JLabel[7];
		for (int i = 0; i < days.length; i++) {
			days[i] = new JLabel();
		}
		days[0].setText("SUN");
		days[0].setForeground(Color.RED);
		days[1].setText("MON");
		days[2].setText("TUE");
		days[3].setText("WED");
		days[4].setText("THU");
		days[5].setText("FRI");
		days[6].setText("SAT");
		days[6].setForeground(Color.blue);
		for (int i = 0; i < days.length; i++) {
			days[i].setFont(new Font("µ¸¿ò",Font.PLAIN,30));
			days[i].setHorizontalAlignment(JLabel.RIGHT);
			days[i].setVerticalAlignment(JLabel.CENTER);
			add(days[i]);
		}
		setDate();
		updateDate(CalendarDisplay.year,CalendarDisplay.month);
	}
	
	public void resetDate() {
		for (int i = 0; i < date.length; i ++) {
			date[i].setText("");
		}
	}
	
	public void updateDate(int year, int month) {
		cal.set(CalendarDisplay.year, CalendarDisplay.month-1,1);
		int lastDay = cal.getActualMaximum(cal.DAY_OF_MONTH);
		int startWeek = cal.get(cal.DAY_OF_WEEK);
		for (int i = 0, num = 1; i < date.length; i ++) {
			if (i < startWeek - 1 || num > lastDay) {
				date[i].setText("");
			} else {
				date[i].setText(""+num);
				num++;
			}
		}
	}
	
	public void setDate() {
		for (int i = 0; i < date.length; i ++) {
			date[i] = new JLabel();
			date[i].setText("");
			date[i].setFont(new Font("µ¸¿ò",Font.PLAIN,30));
			if (i%7 == 0) {
				date[i].setForeground(Color.RED);
			} else if (i%7 == 6) {
				date[i].setForeground(Color.BLUE);
			}
			date[i].setHorizontalAlignment(JLabel.RIGHT);
			date[i].setVerticalAlignment(JLabel.CENTER);
			add(date[i]);
		}
	}
}
