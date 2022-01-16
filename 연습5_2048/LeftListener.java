package ¿¬½À5_2048;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class LeftListener implements ActionListener {

	Function2048 func = new Function2048();
	Random rd = new Random();
	
	public void actionPerformed(ActionEvent e) {
		
		for (int c = 0; c <= 3; c++) {
			for (int i = Game2048.labels.length -1 ; i > 0 ; i--) {
				if (i%4 != 0) {
					func.mergaLabel(Game2048.labels[i-1], Game2048.labels[i]);
				}
			}
		}
		
		boolean check = false;
		for (int i = 0; i < Game2048.labels.length; i++) {
			if (Game2048.labels[i].getText().equals("")) {
				check = true;
			}
		}
		
		if (check) {
			for (int i = 0;  i < 1; i++) {
				int rand = rd.nextInt(16);
				if (Game2048.labels[rand].getText().equals("")) {
					Game2048.labels[rand].setText(""+2*(rd.nextInt(2)+1));
				} else {
					i--;
				}
				
			}
		} else {
			for (int i = 0; i < Game2048.labels.length; i ++) {
				if (i%8 == 0) {
					Game2048.labels[i].setText("G");
				} else if (i%8 == 1) {
					Game2048.labels[i].setText("A");
				} else if (i%8 == 2) {
					Game2048.labels[i].setText("M");
				} else if (i%8 == 3) {
					Game2048.labels[i].setText("E");
				} else if (i%8 == 4) {
					Game2048.labels[i].setText("O");
				} else if (i%8 == 5) {
					Game2048.labels[i].setText("V");
				} else if (i%8 == 6) {
					Game2048.labels[i].setText("E");
				} else if (i%8 == 7) {
					Game2048.labels[i].setText("R");
				}
			}
		}
	}

}
