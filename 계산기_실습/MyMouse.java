package ����_�ǽ�;

import java.awt.event.*;

public class MyMouse extends MouseAdapter {
	
	public void mousepressed(MouseEvent e) {
		if (e.getClickCount() == 2) {
			Calculator.flag = 0;
			Calculator.label.setText("");
			Calculator.info.setText("������ �Է��ϼ���!! ");
		}
	}
	
}
