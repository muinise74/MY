package ���ο���2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static double cal(double a, double b, String c) {
		double result = 0;
		if (c.equals("+")) {
			result = a+b;
		} else if (c.equals("-")) {
			result = a-b;
		} else if (c.equals("*")) {
			result = a*b;
		} else if (c.equals("/")) {
			result = a/b;
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Practice> pt = new ArrayList<Practice>();
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		double num1;
		double num2;
		double result;
		String op = "";
		
		while(!(op.equals("end"))) {
			System.out.print("�Է� : ");
			op = sc.next();
			if(!(op.equals("end"))) {
				System.out.print("ù ��° �� �Է� : ");
				num1 = sc.nextDouble();
				System.out.print("�� ��° �� �Է� : ");
				num2 = sc.nextDouble();
				result = cal(num1,num2,op);
				op = String.valueOf(result);
			}
			pt.add(new Practice("���",360,120));
			pt.get(i).createDisplay(op);
			i++;
		}
		sc.close();
	}

}
