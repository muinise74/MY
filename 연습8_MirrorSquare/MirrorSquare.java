ackage 연습8_MirrorSquare;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MirrorSquare extends JFrame implements Runnable{
	
	private Thread thread;
	static JButton[] bts = new JButton[64];
	Random rd = new Random();
	
	public MirrorSquare() {
		setTitle("Oh, My Eye!!!!!!");
		setLayout(new GridLayout(8,8,0,0));
		setSize(360,365);
		setResizable(true);
		
		if(thread == null){
			thread = new Thread(this);
			thread.start();
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void run() {
		for (int i = 0; i < bts.length; i++) {
			bts[i] = new JButton();
			bts[i].setEnabled(false);
			add(bts[i]);
		}
		
		while(true) {
			for (int i = 0; i < bts.length; i++) {
				// 랜덤 색상 추출
				int r = rd.nextInt(256);
				int g = rd.nextInt(256);
				int b = rd.nextInt(256);
				bts[i].setBackground(new Color(r,g,b));
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
