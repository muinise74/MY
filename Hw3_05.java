package javafestival_3weeks;

import java.util.Scanner;

public class Hw3_05 {
	public static void getPerfectNumber(int a, int b) {
		System.out.printf("%d~%d������ ������ : ",a,b);
		for (int i = a; i <= b; i++) {
			int sum =0 ;
			for (int j = 1; j < i; j++) {
				if (i%j==0) {
					sum += j;
				}
			}
			if (sum == i) {
				System.out.print(i+ " ");
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �� �Է� : ");
		int startValue = sc.nextInt();
		System.out.print("���� �� �Է� : ");
		int endValue = sc.nextInt();
		
		getPerfectNumber(startValue,endValue);
		sc.close();
	}

}
