import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// ������ : � ���� �� �ڸ��� ���� ���� ��� ���� ��
		// ������ : � �� M�� �������� N�� ��, M�� N�� �����ڶ�� �Ѵ�.
		// �ڿ��� N�� ���� ���� �����ڸ� ���ϴ� ���α׷� �ۼ�
		// �ڱ� �ڽź��� ū �����ڴ� ���� �� ����.
		Scanner sc = new Scanner(System.in);
		System.out.print("�ڿ��� �Է� : ");
		int num = sc.nextInt();
		
		int min = 0;
		for (int i = num; i > 0; i--) {
			int sum = 0;
			for (int temp = i; temp > 0; temp /= 10) {
				sum += temp%10;
			}
			if (i + sum == num) {
				min = i;
			}
		}
		if (min != 0) {
			System.out.printf("%d�� �������� ���� ���� ���� %d�Դϴ�.\n",num,min);
		} else {
			System.out.printf("%d�� �����ڴ� �����ϴ�.\n",num);
		}
		sc.close();
	}

}
