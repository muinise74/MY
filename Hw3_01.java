package javafestival_3weeks;

public class Hw3_01 {
	
	public static boolean isDivide(int a, int b) {
		boolean isCheck;
		if (a%b==0) {
			isCheck = true;
		} else {
			isCheck = false;
		}
		return isCheck;
		
}
	public static void main(String[] args) {
	
		int num1 = 10, num2 = 2, num3 = 3;
		
		System.out.println("결과 확인 : " + isDivide(num1,num2));
		System.out.println("결과  : " + isDivide(num1,num3));
	}

}
