package ����_�ǽ�;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Cal_Listener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		String s = Calculator.label.getText();
		double result = cal(s);
		Calculator.label.setFont(new Font("���� ���", 0, 40));

		if (result < 0) {
			Calculator.info.setText("��� ������ ��길 �� �� �ֽ��ϴ�.");
			Calculator.label.setText(Double.toString(result));
			Calculator.flag = 1;
		} else if (result >= 10000000) {
			Calculator.info.setText("10,000,000 �̸��� ������ ��길 �� �� �ֽ��ϴ�.");
			Calculator.label.setText("0.0");
		} else {
			Calculator.label.setText(Double.toString(result));
		}
	}

	public double cal(String ss) {
		int i;
		double ans;
		Calculator.check = 0;
		
		ArrayList<Double> v = new ArrayList<Double>();
		ArrayList<String> op = new ArrayList<String>();
		
		op.add(null);
		String str = new String("");
		for (i = 0 ; i < ss.length(); i++) {
			Character c = ss.charAt(i);
			String s = Character.toString(c);
			
			if(Character.isDigit(c)) {
				str += Character.toString(c);
				if (i == ss.length()-1) {
					v.add(Double.parseDouble(str));
				}
			} else if (s.equals(".")){
				str += s;
			} else {
				v.add(Double.parseDouble(str));
				op.add(Character.toString(c));
				str = "";
			}
		}
		
		for (i = 0; i < v.size(); i++) {
			if(v.get(i) >= 10000000) {
				Calculator.check = 1;
				Calculator.info.setText("10,000,000 �̸��� �� ������ ����� �� �ֽ��ϴ�. ");
				break;
			}
		}
			
		if (Calculator.check == 0) {
			for (i = 1; i < v.size();i++) {
				String s = op.get(i);
				double tmp;
					
				if(s.equals("*")) {
					tmp = v.get(i-1)*v.get(i);
					op.remove(i);
					v.remove(i);
					v.remove(i-1);
					v.add(i-1,tmp);
					i--;
				} else if(s.equals("/")) {
					tmp = v.get(i-1)/v.get(i);
					op.remove(i);
					v.remove(i);
					v.remove(i-1);
					v.add(i-1,tmp);
					i--;
				}
			}
			
			ans = v.get(0);
			for(i = 1; i < v.size(); i++) {
				String s = op.get(i);
				double n = v.get(i);
			
				if(s.compareTo("+") == 0) {
					ans = ans + n;
				} else if(s.compareTo("-") == 0) {
					ans = ans - n;
				}
			}
			return ans;
		}
		return 0;
	}
}
