import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// ������
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		int[][] matrix = new int[input][input];

		int n = 1, limit = input;
		int direct = 1; // ����
		int x = 0, y = -1; // �ʱⰪ

		while (true) {
			for (int i = 0; i < limit; i++) {
				y += direct;
				matrix[y][x] = n;
				n++;
			}
			limit--;
			if (n > input * input) {
				break;
			}
			for (int i = 0; i < limit; i++) {
				x += direct;
				matrix[y][x] = n;
				n++;
			}
			direct = -direct;
			if (n > input * input) {
				break;
			}
		}
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input; j++) {
				if (matrix[i][j] < 10) {
					System.out.print(" "+matrix[i][j]+" ");
				} else {
					System.out.print(matrix[i][j]+" ");
				}
			}
			System.out.println("");
		}
		sc.close();
	}

}
