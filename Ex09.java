import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// ����Ʈ�� ����
		// �ڿ��� n �� �Է¹޾� n���� ũ�� 2n������ �Ҽ��� ����ϰ� ���� ����
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ڿ��� �Է� : ");
		int input = sc.nextInt();
		int cnt = 0;
		for (int i = input + 1; i <= 2*input; i++) {
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					if (i == j) {
						System.out.print(i+" ");
						cnt++;
					}else {
						break;
					}
				}
			}
		}
		System.out.println("");
		System.out.println(input+"���� ũ�� "+2*input+"������ �Ҽ��� �� : "+cnt);
		sc.close();
	}

}
