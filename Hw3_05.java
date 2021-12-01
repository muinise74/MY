package javafestival_3weeks;

import java.util.Scanner;

public class Hw3_05 {
	public static void getPerfectNumber(int a, int b) {
		System.out.printf("%d~%d까지의 완전수 : ",a,b);
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
		
		System.out.print("시작 값 입력 : ");
		int startValue = sc.nextInt();
		System.out.print("종료 값 입력 : ");
		int endValue = sc.nextInt();
		
		getPerfectNumber(startValue,endValue);
		sc.close();
	}

}
