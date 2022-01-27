package ¿¬½À8_MirrorSquare;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MirrorSquare extends JFrame implements Runnable{
	
	private Thread thread;
	Random rd = new Random();
	
	public MirrorSquare() {
		setTitle("Oh, My Eye!!!!!!");
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
		
		JButton bt = new JButton("");
		add(bt);
		bt.setEnabled(false);
		while(true) {
			int r = rd.nextInt(256);
			int g = rd.nextInt(256);
			int b = rd.nextInt(256);
			bt.setBackground(new Color(r,g,b));
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
