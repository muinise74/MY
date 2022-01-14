package minesweeper;

import javax.swing.*;
import java.awt.*;

public class NorthPanel extends JPanel{
	
	public NorthPanel() {
		setLayout(new GridLayout(2,1));
		setBackground(Color.BLACK);
		
		MineSweeper.info.setFont(new Font("맑은 고딕",0,20));
		MineSweeper.info.setBackground(Color.BLACK);
		MineSweeper.info.setForeground(Color.WHITE);
		MineSweeper.info.setHorizontalAlignment(SwingConstants.RIGHT);

		MineSweeper.label.setFont(new Font("맑은 고딕",0,20));
		MineSweeper.label.setBackground(Color.BLACK);
		MineSweeper.label.setForeground(Color.WHITE);
		MineSweeper.label.setHorizontalAlignment(SwingConstants.RIGHT);
		
		add(MineSweeper.info);
		add(MineSweeper.label);
	}

}
