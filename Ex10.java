import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// �������� ���� : 2���� ū ��� ¦���� �� �Ҽ��� ������ ��Ÿ�� �� �ִ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("4 �̻��� ¦�� �Է� : ");
		int input = sc.nextInt();
		int p1 = 0, p2 = 0;
		for (int i = input/2; i > 1; i--) {
			for (int j = 2; j <= i; j++) {
				if (i%j==0) {
					if (i==j) {
						p1 = i;
					}else {
						break;
					}
				}
			}
			for (int j = 2; j <= input - i; j++) {
				if ((input - i)%j==0) {
					if (j==input - i) {
						p2 = input - i;
					}else {
						break;
					}
				}
			}
			if (p1 != 0 && p2 != 0) {
				System.out.println(input + " = " + p1 + " + " + p2);
				break;
			}
		}
		sc.close();
	}

}
