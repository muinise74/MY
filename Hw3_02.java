package javafestival_3weeks;

public class Hw3_02 {

	public static int cal(int a, int b, char c) {
		int result = 0;
		if (c == '+') {
			result = a+b;
		} else if (c == '-') {
			result = a-b;
		} else if (c == '*') {
			result = a*b;
		} else if (c == '/') {
			result = a/b;
		} else if (c == '%') {
			result = a%b;
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		int num1 = 50, num2 =3;
		char op1 = '+';
		char op2 = '-';
		char op3 = '*';
		char op4 = '/';
		char op5 = '%';
		
		System.out.println(cal(num1,num2,op1));
		System.out.println(cal(num1,num2,op2));
		System.out.println(cal(num1,num2,op3));
		System.out.println(cal(num1,num2,op4));
		System.out.println(cal(num1,num2,op5));
	}

}
