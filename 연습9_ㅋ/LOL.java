package 연습9_ㅋ;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.*;

public class LOL extends JFrame implements Runnable{
	
	private Thread thread;
	static JLabel[] btns = new JLabel[81];
	static int[] ord = {0,1,2,3,4,5,6,7,8,17,26,35,44,53,62,71,80,79,78,77,76,75,74,73,72,63,54,45,36,27,18,9,10,11,12,13,14,15,16,25,34,43,52,61,70,69,68,67,66,65,64,55,46,37,28,19,20,21,22,23,24,33,42,51,60,59,58,57,56,47,38,29,30,31,32,41,50,49,48,39,40};
	
	public LOL() {
		setTitle("ㅋ");
		setSize(360,365);
		setResizable(true);
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
			btns[i] = new JLabel();
			btns[i].setBackground(Color.WHITE);
			add(btns[i]);
		}
	}
	
	public void setRandom() {
		
		for (int i = 0; i < btns.length; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			btns[ord[i]].setFont(new Font("San Serif",Font.BOLD,35));
			btns[ord[i]].setText("ㅋ");
			btns[ord[(i+80)%81]].setText(" ");
		}

	}

	
	@Override
	public void run() {
		setBtns();
		while(true) {
			setRandom();
		}
	}
}
