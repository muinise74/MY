package 연습2_그림;

import javax.swing.*;
import java.awt.*;

public class PaintPanel extends JPanel{
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawLine(DrawEvent.x1,DrawEvent.y1,DrawEvent.x2,DrawEvent.y2);
	}
	
}
