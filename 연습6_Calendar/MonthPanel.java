package ¿¬½À6_Calendar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;

public class MonthPanel extends JPanel{
	
	Calendar cal = Calendar.getInstance();
	public MonthPanel() {
		
		currentYear();
		currentMonth();
		setLayout(new GridLayout(1,3,5,5));
		JButton previous = new JButton("<<");
		JLabel yearMonth = new JLabel();
		JButton next = new JButton(">>");
		
		yearMonth.setText(CalendarDisplay.year+"³â "+CalendarDisplay.month+"¿ù");
		yearMonth.setFont(new Font("µ¸¿ò",Font.PLAIN,30));
		yearMonth.setHorizontalAlignment(JLabel.CENTER);
		yearMonth.setVerticalAlignment(JLabel.CENTER);
		previous.setFont(new Font("µ¸¿ò",Font.PLAIN,30));
		next.setFont(new Font("µ¸¿ò",Font.PLAIN,30));
		previous.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				CalendarDisplay.month--;
				if (CalendarDisplay.month == 0) {
					CalendarDisplay.month = 12;
					CalendarDisplay.year--;
				}
				yearMonth.setText(CalendarDisplay.year+"³â "+CalendarDisplay.month+"¿ù");
				CalendarDisplay.dp.resetDate();
				CalendarDisplay.dp.updateDate(CalendarDisplay.year,CalendarDisplay.month);
			}
			
		});
		next.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				CalendarDisplay.month++;
				if (CalendarDisplay.month == 13) {
					CalendarDisplay.month = 1;
					CalendarDisplay.year++;
				}
				yearMonth.setText(CalendarDisplay.year+"³â "+CalendarDisplay.month+"¿ù");
				CalendarDisplay.dp.resetDate();
				CalendarDisplay.dp.updateDate(CalendarDisplay.year,CalendarDisplay.month);
			}
			
		});
		
		add(previous);
		add(yearMonth);
		add(next);
	}
	
	private void currentYear() {
		CalendarDisplay.year = cal.get(Calendar.YEAR);
	}
	private void currentMonth() {
		CalendarDisplay.month = cal.get(Calendar.MONTH)+1;
	}

}
