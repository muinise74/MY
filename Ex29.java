package ���ο���;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
//		�߰��迡 ����ִ� ���� ������ Ư�� ���ڸ� �ٸ� ���ں��� �߿��ϴٰ� �ϴ´�. ����, �׵��� �ݼ� n��ŭ�� �̿��ؼ� Į�� ���� ��, �β��� ������ ���� ��Ģ�� ��Ű�� k�� �Ѵٸ�, ��û���� ������ Į�� ���� �� �ִٰ� �ϴ´�.
//		���� �ƴ� ���� n�� �־����� ��, ������ ���� ������ ���� �� �ִ�.
//		n, 2n, 3n, 4n, ..., kn
//		�̶��� ��������, 0~9������ ���ڰ� �� �� �̻� ��Ÿ���� ���� ���� k�� ã�ƾ� �Ѵ�.
//		���쵨�� ���� ���е�� �� ���� ������ִ� ���α׷��� ������� �Ѵ�. �ݼ��� �� n�� �־����� ��, ���� ��Ģ�� ��Ű�� �̻����� �β� k�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

		Scanner sc = new Scanner(System.in);
		System.out.print("N �Է� : ");
		int n = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int k = 1;
		while(arr.size() != 10) {
			for (int i = k*n; i > 0; i /= 10 ) {
				if (arr.contains(i%10)) {
				} else {
					arr.add(i%10);
				}
			}
			k++;
			
		}
		
		System.out.println("��� : " + (k-1));
		sc.close();
	}

}
