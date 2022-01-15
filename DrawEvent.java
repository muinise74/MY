package 연습2_그림;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class DrawEvent extends JFrame{
	
	Container c = getContentPane();
	static PaintPanel panel = new PaintPanel();
	static int x1,x2,y1,y2;
	MouseAdapter adapter = new MouseAdapter() {
		
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
			DrawEvent.x1 = e.getX();
			DrawEvent.y1 = e.getY();
		}
		
		public void mouseDragged(MouseEvent e) {
			super.mouseDragged(e);
			DrawEvent.x2 = e.getX();
			DrawEvent.y2 = e.getY();
			repaint();
		}
	};
	
	public DrawEvent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("선 그리기");
		panel.addMouseListener(adapter);
		panel.addMouseMotionListener(adapter);
		c.add(panel);
		setSize(500,500);
		setVisible(true);
	}
}
