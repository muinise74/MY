package ���ο���;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		
		// ���丮�� 0 �� ����
		
		Scanner sc = new Scanner(System.in);
		// ���� �Է�
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		// ����
		int cnt2=0, cnt5 = 0, cnt10 = 0;
		for (int i = 1; i <= num; i++) {
			if (i%2 == 0 && i % 10 != 0) {
				cnt2++;
			} else if (i%5 == 0 && i % 10 != 0) {
				cnt5++;
			} else if (i%10 == 0) {
				cnt10++;
			}
		}
		// ���
		int cnt0 = 0;
		if (cnt2 >= cnt5) {
			cnt0 = cnt5 + cnt10;
		} else {
			cnt0 = cnt2 + cnt10;
		}
		// ���
		System.out.println("��� : "+cnt0);
	}

}
