package ���ο���;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= num; j++) {
				if (i == 0 || j == 0 || i == num || j == num || i == j || i + j == num) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
		
		sc.close();
	}
}
