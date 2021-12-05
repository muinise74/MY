package 개인연습2;

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
			System.out.print("입력 : ");
			op = sc.next();
			if(!(op.equals("end"))) {
				System.out.print("첫 번째 수 입력 : ");
				num1 = sc.nextDouble();
				System.out.print("두 번째 수 입력 : ");
				num2 = sc.nextDouble();
				result = cal(num1,num2,op);
				op = String.valueOf(result);
			}
			pt.add(new Practice("계산",360,120));
			pt.get(i).createDisplay(op);
			i++;
		}
		sc.close();
	}

}
