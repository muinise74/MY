
public class Exam07 {
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
		System.out.println(cal(3,5,'-'));
	}

}
