package 계산기_실습;

import java.awt.event.*;

public class MyMouse extends MouseAdapter {
	
	public void mousepressed(MouseEvent e) {
		if (e.getClickCount() == 2) {
			Calculator.flag = 0;
			Calculator.label.setText("");
			Calculator.info.setText("수식을 입력하세요!! ");
		}
	}
	
}
