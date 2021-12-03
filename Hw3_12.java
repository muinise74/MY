package javafestival_3weeks;

import java.util.ArrayList;
import java.util.Scanner;

public class Hw3_12 {

	public static int jumpCase(int a) {
		// 피보나치 수열 문제(금요일 1번)랑 같은 문제이다...
		ArrayList<Integer> jump = new ArrayList<Integer>();
		jump.add(1);
		jump.add(2);
		for (int i = 2; i < a; i++) {
			jump.add(jump.get(i-1)+jump.get(i-2));
		}
		return jump.get(a-1);
		
//		int[] arr = new int[a];
//		if (a == 1) {
//			arr[0] = 1;
//		} else {
//			arr[0] = 1;
//			arr[1] = 2;
//			for (int i = 2; i < arr.length; i++) {
//				arr[i] = arr[i - 1] + arr[i - 2];
//			}
//		}
//		return arr[a-1];
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("칸 수 입력 : ");
		int jump = sc.nextInt();
		
		System.out.printf("결과 : %d\n",jumpCase(jump));
		sc.close();
	}

}
