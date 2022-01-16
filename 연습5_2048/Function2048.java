package ¿¬½À5_2048;

import javax.swing.JLabel;

public class Function2048 {
	
	public void mergaLabel(JLabel l1, JLabel l2) {
		String str1 = l1.getText();
		String str2 = l2.getText();
		if (str1.equals(str2) && !str1.equals("") && !str2.equals("")) {
			int temp = Integer.parseInt(str1)+Integer.parseInt(str2);
			l1.setText(""+temp);
			l2.setText("");
		} else if (str1.equals("")) {
			l1.setText(l2.getText());
			l2.setText("");
		}
	}
}
