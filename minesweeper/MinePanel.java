package minesweeper;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MinePanel extends JPanel {

	Mine m = new Mine();

	char[][] mine = m.mine();

	public MinePanel() {
		JButton[] bt = new JButton[900];
		setBackground(Color.BLACK);
		setLayout(new GridLayout(30, 30, 1, 1));
		MineSweeper.info = new JLabel("");
		MineSweeper.label = new JLabel("");
		int cnt = m.cntMine();
		String text = "Áö·Ú °³¼ö : " + cnt;
		MineSweeper.info.setText(text);
		MineSweeper.label.setText("³²Àº Ä­¼ö : " + MineSweeper.cntButton);

		for (int i = 0; i < 900; i++) {

			bt[i] = new JButton(" ");
			bt[i].setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
			bt[i].setBackground(Color.GRAY);
			bt[i].setForeground(Color.GRAY);
			add(bt[i]);
			bt[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					for (int j = 0; j < 900; j++) {
						String a = "" + mine[j / 30 + 1][j % 30 + 1];
						if (e.getSource() == bt[j]) {
							bt[j].setText(a);
							bt[j].setBackground(Color.white);
							bt[j].setForeground(Color.GRAY);
							bt[j].setEnabled(false);
							MineSweeper.cntButton = 0;
							for (int l = 0; l < 900; l++) {
								if (bt[l].getText().equals(" ")){
									MineSweeper.cntButton++;
								}
							}
							MineSweeper.label.setText("³²Àº Ä­¼ö : " + MineSweeper.cntButton);
							

							if (bt[j].getText().equals("*")) {
								MineSweeper.label.setText("Game Over!!!");
								MineSweeper.label.setFont(new Font("¸¼Àº °íµñ", 0, 40));
								for (int k = 0; k < 900; k++) {
									bt[k].setEnabled(false);
								}
							} else if (bt[j].getText().equals("0")) {
								int c = j / 30 + 1;
								int d = j % 30 + 1;
								for (int k = 0; k < 900; k++) {
									int x = k / 30 + 1;
									int y = k % 30 + 1;
									if (j == k) {
									} else if ((x - c) * (x - c) + (y - d) * (y - d) <= 25 && mine[x][y] == '0') {
										bt[k].setText("" + mine[x][y]);
										bt[k].setBackground(Color.white);
										bt[k].setForeground(Color.GRAY);
										bt[k].setEnabled(false);
										MineSweeper.cntButton = 0;
										for (int l = 0; l < 900; l++) {
											if (bt[l].getText().equals(" ")){
												MineSweeper.cntButton++;
											}
										}
										MineSweeper.label.setText("³²Àº Ä­¼ö : " + MineSweeper.cntButton);
									}
								}
							}
						}

					}
					if (cnt == MineSweeper.cntButton) {
						MineSweeper.label.setText("Game Clear!!!");
						MineSweeper.label.setFont(new Font("¸¼Àº °íµñ", 0, 40));
						for (int k = 0; k < 900; k++) {
							bt[k].setEnabled(false);
						}
					}
				}
			});
		}
	}
}
