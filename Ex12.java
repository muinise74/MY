import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// ������ - Ȧ�� magic square 2�ڸ������� �Է�����....
		Scanner sc = new Scanner(System.in);
		System.out.print("Ȧ�� �Է�(��Ź�ε� 2�ڸ� ������ �Է�����.....) : ");
		int odd = sc.nextInt();
		// �迭 ���� �� �ӽð� ����
		int[][] ms = new int[odd + 2][odd + 2];
		for (int a = 0; a < odd + 2; a++) {
			for (int b = 0; b < odd + 2; b++) {
				if (a == 0 || b == 0 || a == odd + 1 || b == odd + 1) {
					ms[a][b] = 1;
				} else {
					ms[a][b] = 0;
				}
			}
		}
		// ������ �ۼ�
		int i = 1, j = (odd + 1) / 2, n = 1;
		while (i >= 1 && i <= odd && j >= 1 && j <= odd) {
			ms[i][j] = n;
			if (i == 1) {
				if (ms[odd][j + 1] == 0) {
					j++;
					i = odd;
				} else {
					i++;
				}
			} else if (j == odd) {
				if (ms[i - 1][1] == 0) {
					i--;
					j = 1;
				} else {
					i++;
				}
			} else {
				if (ms[i - 1][j + 1] != 0) {
					i++;
				} else {
					i--;
					j++;
				}
			}
			n++;
			if (n > odd * odd) {
				break;
			}
		}
		// ������ ���
		if (n - 1 >= 1000) {
			for (int a = 1; a < odd + 1; a++) {
				for (int b = 1; b < odd + 1; b++) {
					if (ms[a][b] < 10) {
						System.out.print("000" + ms[a][b] + " ");
					} else if (ms[a][b] < 100) {
						System.out.print("00" + ms[a][b] + " ");
					} else if (ms[a][b] < 1000) {
						System.out.print("0" + ms[a][b] + " ");
					} else {
						System.out.print(ms[a][b] + " ");
					}
				}
				System.out.println("");
			}
		} else if (n - 1 >= 100) {
			for (int a = 1; a < odd + 1; a++) {
				for (int b = 1; b < odd + 1; b++) {
					if (ms[a][b] < 10) {
						System.out.print("00" + ms[a][b] + " ");
					} else if (ms[a][b] < 100) {
						System.out.print("0" + ms[a][b] + " ");
					} else {
						System.out.print(ms[a][b] + " ");
					}
				}
				System.out.println("");
			}
		} else if (n - 1 >= 10) {
			for (int a = 1; a < odd + 1; a++) {
				for (int b = 1; b < odd + 1; b++) {
					if (ms[a][b] < 10) {
						System.out.print("0" + ms[a][b] + " ");
					} else {
						System.out.print(ms[a][b] + " ");
					}
				}
				System.out.println("");
			}
		} else {
			for (int a = 1; a < odd + 1; a++) {
				for (int b = 1; b < odd + 1; b++) {
					System.out.print(ms[a][b] + " ");
				}
				System.out.println("");
			}
		}

		// �˻� : ��°��� �������� �´��� üũ���ִ� �κ�
		// ���� ��
		for (int a = 1; a <= odd; a++) {
			int sum = 0;
			for (int b = 1; b <= odd; b++) {
				sum += ms[a][b];
			}
			System.out.printf("��%d�� �� : %d\n", a, sum);
		}
		// ���� ��
		for (int b = 1; b <= odd; b++) {
			int sum = 0;
			for (int a = 1; a <= odd; a++) {
				sum += ms[a][b];
			}
			System.out.printf("��%d�� �� : %d\n", b, sum);
		}
		// �밢���� �� 1
		int sum1 = 0;
		for (int b = 1; b <= odd; b++) {
			for (int a = 1; a <= odd; a++) {
				if (a == b) {
					sum1 += ms[a][b];
				}
			}
		}
		System.out.println("�밢��1�� �� : " + sum1);
		// �밢���� ��2
		int sum2 = 0;
		for (int b = 1; b <= odd; b++) {
			for (int a = 1; a <= odd; a++) {
				if (a + b == odd + 1) {
					sum2 += ms[a][b];
				}
			}
		}
		System.out.println("�밢��1�� �� : " + sum2);
	}

}
