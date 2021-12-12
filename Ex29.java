package 개인연습;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
//		중간계에 살고있는 엘프 종족은 특정 숫자를 다른 숫자보다 중요하다고 믿는다. 따라서, 그들은 금속 n만큼을 이용해서 칼을 만들 때, 두께를 다음과 같은 규칙을 지키는 k로 한다면, 엄청나게 강력한 칼을 만들 수 있다고 믿는다.
//		음이 아닌 정수 n이 주어졌을 때, 다음과 같은 수열을 만들 수 있다.
//		n, 2n, 3n, 4n, ..., kn
//		이때의 수열에서, 0~9까지의 숫자가 한 번 이상 나타나는 가장 작은 k를 찾아야 한다.
//		리븐델의 영주 엘론드는 이 일을 대신해주는 프로그램을 만들려고 한다. 금속의 양 n이 주어졌을 때, 위의 규칙을 지키는 이상적인 두께 k를 구하는 프로그램을 작성하시오.

		Scanner sc = new Scanner(System.in);
		System.out.print("N 입력 : ");
		int n = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int k = 1;
		while(arr.size() != 10) {
			for (int i = k*n; i > 0; i /= 10 ) {
				if (arr.contains(i%10)) {
				} else {
					arr.add(i%10);
				}
			}
			k++;
			
		}
		
		System.out.println("결과 : " + (k-1));
		sc.close();
	}

}
