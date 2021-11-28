import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		//N장의 카드에 써져 있는 숫자가 주어졌을 때, M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합과 그 카드에 써 있는 수를 구해 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("N 입력 : ");
		int n = sc.nextInt();
		System.out.print("M 입력 : ");
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print(i+1+"번째 카드에 써있는 수 입력 : ");
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
		System.out.printf("%d,%d,%d의 합 : %d",temp1,temp2,temp3,max);
	}
	
}
