package ����_�ǽ�;

import java.awt.*;
import javax.swing.*;

public class NorthPanel extends JPanel {
	
	public NorthPanel() {
		setLayout(new GridLayout(3,1));
		setBackground(Color.BLACK);
		
		Calculator.info = new JLabel("������ �Է��ϼ���!! ");
		Calculator.label = new JLabel("");
		
		Calculator.info.setFont(new Font("���� ���",0,20));
		Calculator.info.setBackground(Color.BLACK);
		Calculator.info.setForeground(Color.WHITE);
		Calculator.info.setHorizontalAlignment(SwingConstants.RIGHT);

		Calculator.label.setFont(new Font("���� ���",0,40));
		Calculator.label.setBackground(Color.BLACK);
		Calculator.label.setForeground(Color.WHITE);
		Calculator.label.setHorizontalAlignment(SwingConstants.RIGHT);
		
		add(Calculator.info);
		add(Calculator.label);
		Calculator.label.addMouseListener(new MyMouse());
	}
}
