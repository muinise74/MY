import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		//N���� ī�忡 ���� �ִ� ���ڰ� �־����� ��, M�� ���� �����鼭 M�� �ִ��� ����� ī�� 3���� �հ� �� ī�忡 �� �ִ� ���� ���� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("N �Է� : ");
		int n = sc.nextInt();
		System.out.print("M �Է� : ");
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print(i+1+"��° ī�忡 ���ִ� �� �Է� : ");
			arr[i] = sc.nextInt();
		}
		
		int max = 0;
		int temp1 = -1, temp2 = -1, temp3 = -1;
		
		for (int i = 0; i < n-2; i++) {
			for (int j = i+1; j < n-1; j++) {
				for (int k = j+1; k < n; k++) {
					if (Math.abs(arr[i]+arr[j]+arr[k]-m) <= Math.abs(max-m)) {
						max = arr[i]+arr[j]+arr[k];
						temp1 = arr[i];
						temp2 = arr[j];
						temp3 = arr[k];
					}
				}
			}
		}
		System.out.printf("%d,%d,%d�� �� : %d",temp1,temp2,temp3,max);
	}
	
}
