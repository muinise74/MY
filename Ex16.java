import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// 분해합 : 어떤 수와 각 자리의 수의 합을 모두 더한 값
		// 생성자 : 어떤 수 M의 분해합이 N일 때, M을 N의 생성자라고 한다.
		// 자연수 N의 가장 작은 생성자를 구하는 프로그램 작성
		// 자기 자신보다 큰 생성자는 있을 수 없다.
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 입력 : ");
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
			System.out.printf("%d의 생성자중 가장 작은 수는 %d입니다.\n",num,min);
		} else {
			System.out.printf("%d의 생성자는 없습니다.\n",num);
		}
		sc.close();
	}

}
