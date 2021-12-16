package 계산기_실습;

import java.awt.*;
import javax.swing.*;

public class NorthPanel extends JPanel {
	
	public NorthPanel() {
		setLayout(new GridLayout(3,1));
		setBackground(Color.BLACK);
		
		Calculator.info = new JLabel("수식을 입력하세요!! ");
		Calculator.label = new JLabel("");
		
		Calculator.info.setFont(new Font("맑은 고딕",0,20));
		Calculator.info.setBackground(Color.BLACK);
		Calculator.info.setForeground(Color.WHITE);
		Calculator.info.setHorizontalAlignment(SwingConstants.RIGHT);

		Calculator.label.setFont(new Font("맑은 고딕",0,40));
		Calculator.label.setBackground(Color.BLACK);
		Calculator.label.setForeground(Color.WHITE);
		Calculator.label.setHorizontalAlignment(SwingConstants.RIGHT);
		
		add(Calculator.info);
		add(Calculator.label);
		Calculator.label.addMouseListener(new MyMouse());
	}
}
