package °è»ê±â_½Ç½À;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CenterPanel extends JPanel {
	
	public CenterPanel() {
		JButton[] bt = new JButton[16];
		setBackground(Color.BLACK);
		setLayout(new GridLayout(4,4,5,5));
		
		bt[0] = new JButton("7");
		bt[1] = new JButton("8");
		bt[2] = new JButton("9");
		bt[3] = new JButton("/");
		
		bt[4] = new JButton("4");
		bt[5] = new JButton("5");
		bt[6] = new JButton("6");
		bt[7] = new JButton("*");
		
		bt[8] = new JButton("1");
		bt[9] = new JButton("2");
		bt[10] = new JButton("3");
		bt[11] = new JButton("-");
		
		bt[12] = new JButton("C");
		bt[13] = new JButton("0");
		bt[14] = new JButton("=");
		bt[15] = new JButton("+");
		
		for (int i = 0; i <= 15; i++) {
			if (i%4 != 3 && i < 11) {
				bt[i].setFont(new Font("¸¼Àº °íµñ",0,30));
				bt[i].setBackground(Color.GRAY);
				bt[i].setForeground(Color.RED);
				add(bt[i]);
				
				bt[i].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (Calculator.flag == 0) {
							JButton b = (JButton)e.getSource();
							String oldtext = Calculator.label.getText();
							String text = b.getText();
							String newtext = oldtext + text;
							
							int n = newtext.length();
							if (n <= 10) {
								Calculator.label.setFont(new Font("¸¼Àº °íµñ",0,40));
							} else if (n > 10) {
								Calculator.label.setFont(new Font("¸¼Àº °íµñ",0,30));
							}
							
							if (n <= 25) {
								Calculator.label.setText(newtext);
								Calculator.info.setText("¼ö½ÄÀ» °è»ê ÁßÀÔ´Ï´Ù. ");
							} else if (n > 25) {
								Calculator.info.setText("ÀÔ·Â °¡´ÉÇÑ ¹üÀ§¸¦ ÃÊ°úÇÏ¼Ì½À´Ï´Ù. ");
							}
						}
					}
				});
			} else if (i == 12 || i == 14) {
				bt[i].setFont(new Font("¸¼Àº °íµñ",0,30));
				bt[i].setBackground(Color.LIGHT_GRAY);
				bt[i].setForeground(Color.WHITE);
				add(bt[i]);
				
				bt[12].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int n = Calculator.label.getText().length()-1;
						
						if (n == 0) {
							Calculator.label.setText("");
							Calculator.info.setText("¼ö½ÄÀ» ÀÔ·ÂÇÏ¼¼¿ä!! ");
							Calculator.flag = 0;
						} else if (n > 0 && n <= 10) {
							Calculator.label.setFont(new Font("¸¼Àº °íµñ",0,40));
							Calculator.label.setText(Calculator.label.getText().substring(0,n));
							Calculator.info.setText("¼ö½ÄÀ» Áö¿ì´Â ÁßÀÔ´Ï´Ù. ");
						} else {
							Calculator.label.setFont(new Font("¸¼Àº °íµñ",0,35));
							Calculator.label.setText(Calculator.label.getText().substring(0,n));
							Calculator.info.setText("¼ö½ÄÀ» Áö¿ì´Â ÁßÀÔ´Ï´Ù. ");
						}
					}
				});
				
				bt[14].addActionListener(new Cal_Listener());
			} else if (i%4 == 3) {
				bt[i].setFont(new Font("¸¼Àº °íµñ",0,40));
				bt[i].setBackground(new Color (234,150,72));
				bt[i].setForeground(Color.WHITE);
				add(bt[i]);
				bt[i].addActionListener(new MyListener());
			} else if (i == 13) {
				bt[i].setFont(new Font("¸¼Àº°íµñ",0,30));
				bt[i].setBackground(Color.GRAY);
				bt[i].setForeground(Color.WHITE);
				add(bt[i]);
				bt[i].addActionListener(new MyListener());
			}
		}
	}
}
