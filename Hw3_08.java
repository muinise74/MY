package javafestival_3weeks;

import java.util.ArrayList;
import java.util.Scanner;

public class Hw3_08 {
	
	public static int fibo(int a) {
		
		ArrayList<Integer> fibo = new ArrayList<Integer>();
		fibo.add(1);
		fibo.add(1);
		for (int i = 2; i < a; i++) {
			fibo.add(fibo.get(i-1)+fibo.get(i-2));
		}
		return fibo.get(a-1);
		
//		int[] fiboarr = new int[a];
//		if (a == 1) {
//			fiboarr[0] = 1;
//		} else {
//			fiboarr[0] = 1;
//			fiboarr[1] = 1;
//			for (int i = 2; i < fiboarr.length; i++) {
//				fiboarr[i] = fiboarr[i - 1] + fiboarr[i - 2];
//			}
//		}
//		return fiboarr[a - 1];
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			System.out.print(fibo(i) + " ");
		}
		sc.close();
	}

}
