package ���ο���;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		// N���� ������ �����ؼ� �� ������� �������� ��ġ �Ǿ��ִ�.
		// �� ������ �ڻ��� ���� ����̸�, ��� �� ������ �ں��� ������� ��������� ������ �� ������ �ں��� ����� �ٲٰ�
		// �� ���� ������ �ں��� ���� �� ��ŭ ���δ�.
		// �̸� �ݺ��Ͽ� ��� ������ �ں��� 0�̻��� �Ƿ��� ��������� ���� �� �� Ȱ�� �Ǿ�� �ϴ°�?

		Scanner sc = new Scanner(System.in);

		System.out.print("������ �� �Է� : ");
		int numBank = sc.nextInt();

		int[] money = new int[numBank];

		System.out.println("��� ������ �ں��� ���� ����� �ǵ���");
		for (int i = 1; i <= numBank; i++) {
			System.out.printf("%d��° ������ �ں� �Է� : ", i);
			money[i - 1] = sc.nextInt();
		}
		
		int cntFairy = 0;
		while(true) {
			boolean isCheck = true;
			for (int i = 0; i < numBank; i++) {
				if (money[i] < 0) {
					money[i] = -money[i];
					if (i == 0) {
						money[1] = money[1]-money[i];
						money[numBank-1] = money[numBank-1]-money[i];
					} else if (i == numBank-1) {
						money[0] = money[0] - money[i];
						money[numBank-2] = money[numBank-2] - money[i];
					} else {
						money [i+1] = money[i+1] - money[i];
						money [i-1] = money[i-1] - money[i];
					}
					cntFairy++;
				}
			}
			for (int i = 0; i < numBank; i++) {
				isCheck = isCheck && (money[i]>=0);
			}
			if (isCheck) {
				break;
			}
		}
		System.out.print("��� ������ �ں��� 0 �̻��� �ǰ� �ϴµ� ");
		System.out.printf("������ ���� %dȸ ���ȴ�....",cntFairy);
		sc.close();
	}

}
