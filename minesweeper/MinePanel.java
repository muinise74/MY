package minesweeper;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MinePanel extends JPanel {

	Mine m = new Mine();

	char[][] mine = m.mine();

	public MinePanel() {
		JButton[] bt = new JButton[MineSweeper.size*MineSweeper.size];
		setBackground(Color.BLACK);
		setLayout(new GridLayout(MineSweeper.size, MineSweeper.size, 1, 1));
		MineSweeper.info = new JLabel("");
		MineSweeper.label = new JLabel("");
		int cnt = m.cntMine();
		String text = "Áö·Ú °³¼ö : " + cnt;
		MineSweeper.info.setText(text);
		MineSweeper.label.setText("³²Àº Ä­¼ö : " + MineSweeper.cntButton);

		for (int i = 0; i < MineSweeper.size*MineSweeper.size; i++) {

			bt[i] = new JButton(" ");
			bt[i].setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
			bt[i].setBackground(Color.GRAY);
			bt[i].setForeground(Color.GRAY);
			add(bt[i]);
			bt[i].addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {
					for (int j = 0; j < MineSweeper.size*MineSweeper.size; j++) {
						String a = "" + mine[j / MineSweeper.size + 1][j % MineSweeper.size + 1];
						if (e.getSource() == bt[j] && e.getButton() == MouseEvent.BUTTON1 && MineSweeper.flag == 0) {
							bt[j].setText(a);
							bt[j].setBackground(Color.white);
							bt[j].setForeground(Color.GRAY);
							bt[j].setEnabled(false);
							MineSweeper.cntButton = 0;
							for (int l = 0; l < MineSweeper.size*MineSweeper.size; l++) {
								if (bt[l].getText().equals(" ")){
									MineSweeper.cntButton++;
								}
							}
							MineSweeper.label.setText("³²Àº Ä­¼ö : " + MineSweeper.cntButton);

							if (bt[j].getText().equals("*")) {
								MineSweeper.label.setText("Game Over!!!");
								MineSweeper.label.setFont(new Font("¸¼Àº °íµñ", 0, 40));
								MineSweeper.flag = 1;
								for (int k = 0; k < MineSweeper.size*MineSweeper.size; k++) {
									bt[k].setEnabled(false);
								}
							} else if (bt[j].getText().equals("0")) {
								int c = j / MineSweeper.size + 1;
								int d = j % MineSweeper.size + 1;
								for (int k = 0; k < MineSweeper.size*MineSweeper.size; k++) {
									int x = k / MineSweeper.size + 1;
									int y = k % MineSweeper.size + 1;
									if (j == k) {
									} else if ((x - c) * (x - c) + (y - d) * (y - d) <= 25 && mine[x][y] == '0') {
										bt[k].setText("" + mine[x][y]);
										bt[k].setBackground(Color.white);
										bt[k].setForeground(Color.GRAY);
										bt[k].setEnabled(false);
										MineSweeper.cntButton = 0;
										for (int l = 0; l < MineSweeper.size*MineSweeper.size; l++) {
											if (bt[l].getText().equals(" ")){
												MineSweeper.cntButton++;
											}
										}
										MineSweeper.label.setText("³²Àº Ä­¼ö : " + MineSweeper.cntButton);
									}
								}
							}
						} else if (e.getSource() == bt[j] && e.getButton() == MouseEvent.BUTTON3 && MineSweeper.flag == 0){
							bt[j].setBackground(Color.RED);
						}

					}
					if (cnt == MineSweeper.cntButton && !MineSweeper.label.getText().equals("Game Over!!!")) {
						MineSweeper.label.setText("Game Clear!!!");
						MineSweeper.label.setFont(new Font("¸¼Àº °íµñ", 0, 40));
						MineSweeper.flag = 1;
						for (int k = 0; k < MineSweeper.size*MineSweeper.size; k++) {
							bt[k].setEnabled(false);
						}
					}
				}

				public void mousePressed(MouseEvent e) {
				}

				public void mouseReleased(MouseEvent e) {
				}

				public void mouseEntered(MouseEvent e) {
				}

				public void mouseExited(MouseEvent e) {
				}
			});
		}
	}
}
