package ¿¬½À5_2048;

import javax.swing.*;
import java.awt.*;

public class TitlePanel extends JPanel {
	
	public TitlePanel() {
		
		JLabel title = new JLabel();
		title.setText("2048");
		title.setFont(new Font("Serif",Font.BOLD,30));
		add(title);
	}
	
}
