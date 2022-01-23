package ¿¬½À7_°ñ¹ðÀÌ;

import javax.swing.*;
import java.awt.*;

public class Spiral extends JFrame implements Runnable{
	
	private Thread thread;
	static JButton[] btns = new JButton[81];
	static int[] ord = {0,1,2,3,4,5,6,7,8,17,26,35,44,53,62,71,80,79,78,77,76,75,74,73,72,63,54,45,36,27,18,9,10,11,12,13,14,15,16,25,34,43,52,61,70,69,68,67,66,65,64,55,46,37,28,19,20,21,22,23,24,33,42,51,60,59,58,57,56,47,38,29,30,31,32,41,50,49,48,39,40};
	
	public Spiral() {
		setTitle("SinWave");
		setSize(720,720);
		setResizable(false);
		setLayout(new GridLayout(9,9,0,0));
		if(thread == null){
			thread = new Thread(this);
			thread.start();
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void setBtns() {
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton();
			btns[i].setBackground(Color.WHITE);
			add(btns[i]);
		}
	}
	
	public void setBlack() {
		for (int i = 0; i < btns.length; i++) {
			btns[ord[i]].setBackground(Color.BLACK);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void setWhite() {
		for (int i = 0; i < btns.length; i++) {
			btns[ord[i]].setBackground(Color.WHITE);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void run() {
		setBtns();
		while(true) {
			setBlack();
			setWhite();
		}
	}
}
