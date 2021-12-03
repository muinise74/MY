package javafestival_3weeks;

import java.util.Scanner;

public class Hw3_11 {
	
	public static boolean isHarshad (int a) {
		int sum = 0;
		for (int i = a; i > 0; i /= 10) {
			sum += i%10;
		}
		return a%sum==0;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		System.out.println(" : " + isHarshad(num));
		sc.close();
	}

}
