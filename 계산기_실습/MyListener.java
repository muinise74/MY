package 계산기_실습;

import java.awt.event.*;
import javax.swing.*;

public class MyListener implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		int n = Calculator.label.getText().length();
		Character c = Calculator.label.getText().charAt(n-1);
		if (Calculator.flag == 0 && c != '+' && c != '-' && c != '*' && c != '/') {
			String oldtext = Calculator.label.getText();
			String text = b.getText();
			String newtext = oldtext + text;
			Calculator.label.setText(newtext);
			Calculator.info.setText("수식을 게산 중입니다. ");
		}
	}

}
