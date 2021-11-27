import java.util.Random;

public class Ex15 {

	public static void main(String[] args) {
		// 3�� 1�� ���������� ��� - 20 ~ 20 �Ƿ��� �Ѱ�� �ش� �ϳ��� ���ϰڽ��ϴ�. �̾�....
		
		// 1. ������ ����
		Random rd = new Random();
		int[][] matrix = new int[3][3];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = rd.nextInt(21) - 10;
			}
		}
		int[] ans = new int[3];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = rd.nextInt(21) - 10;
		}
		// 2. ������ ���
		System.out.println("���� 3�� 1�� ������������ �ذ� �϶�!!!");
		for (int i = 0; i < matrix.length; i++) {
			System.out.printf("%2dx + %2dy + %2dz = %2d\n",matrix[i][0],matrix[i][1],matrix[i][2],ans[i]);
		}
		// 3. ������ Ǯ�� 1
		for (int i = 1; i < matrix.length; i++) {
			int temp = matrix[i][0];
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = matrix[0][0]*matrix[i][j] - matrix[0][j]*temp;
			}
			ans[i] = matrix[0][0]*ans[i]-ans[0]*temp; 
		}
		// 4. �߰� ���� 1
		System.out.println("");
		for (int i = 0; i < matrix.length; i++) {
			System.out.printf("%2dx + %2dy + %2dz = %2d\n",matrix[i][0],matrix[i][1],matrix[i][2],ans[i]);
		}
		// 5. ������ Ǯ�� 2
		int temp2 = matrix[2][1];
		for (int j = 1; j < matrix.length; j++) {
			matrix [2][j] = matrix[1][1]*matrix[2][j] - matrix[1][j]*temp2;
		}
		ans[2] = matrix[1][1]*ans[2]-ans[1]*temp2;
		// 6. �߰� ���� 2
				System.out.println("");
				for (int i = 0; i < matrix.length; i++) {
					System.out.printf("%2dx + %2dy + %2dz = %2d\n",matrix[i][0],matrix[i][1],matrix[i][2],ans[i]);
				}
		// 7. �� ���ϱ�
		double x;
		double y;
		double z;
		while (true) {
			if (matrix[2][2] != 0) {
				z = (double)ans[2]/matrix[2][2];
			} else if (matrix[2][2] == 0 && ans[2] == 0) {
				z = 1;
			} else {
				System.out.println("�ذ� �����ϴ�.");
				break;
			}
			if (matrix[1][1] != 0) {
				y =  (double)(ans[1] - matrix[1][2]*z)/matrix[1][1];
			} else if (matrix[1][1] == 0 && ans[1] - matrix[1][2]*z == 0) {
				y = 1;
			} else { 
				System.out.println("�ذ� �����ϴ�.");
				break;
			}
			if (matrix[0][0] != 0) {
				x = (double)(ans[0]-matrix[0][1]*y-matrix[0][2]*z)/matrix[0][0];
			} else if (matrix[0][0] == 0 && ans[0]-matrix[0][1]*y-matrix[0][2]*z == 0) {
				x = 1;
			} else {
				System.out.println("�ذ� �����ϴ�.");
				break;
			}
			System.out.printf("�� �������� �ش� (%f, %f, %f)�Դϴ�.",x,y,z);
			break;
		}
	}

}
