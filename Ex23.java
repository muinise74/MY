package 개인연습;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		// N개의 은행이 존재해서 그 은행들은 원형으로 배치 되어있다.
		// 각 은행의 자산의 합은 양수이며, 어느 한 은행의 자본이 음수라면 은행요정의 힘으로 그 은행의 자본을 양수로 바꾸고
		// 양 옆의 은행의 자본을 각각 그 만큼 줄인다.
		// 이를 반복하여 모든 은행의 자본이 0이상이 되려면 은행요정의 힘이 몇 번 활용 되어야 하는가?

		Scanner sc = new Scanner(System.in);

		System.out.print("은행의 수 입력 : ");
		int numBank = sc.nextInt();

		int[] money = new int[numBank];

		System.out.println("모든 은행의 자본의 합이 양수가 되도록");
		for (int i = 1; i <= numBank; i++) {
			System.out.printf("%d번째 은행의 자본 입력 : ", i);
			money[i - 1] = sc.nextInt();
		}
		
		int cntFairy = 0;
		while(true) {
			boolean isCheck = true;
			for (int i = 0; i < numBank; i++) {
				if (money[i] < 0) {
					money[i] = -money[i];
					if (i == 0) {
						money[1] = money[1]-money[i];
						money[numBank-1] = money[numBank-1]-money[i];
					} else if (i == numBank-1) {
						money[0] = money[0] - money[i];
						money[numBank-2] = money[numBank-2] - money[i];
					} else {
						money [i+1] = money[i+1] - money[i];
						money [i-1] = money[i-1] - money[i];
					}
					cntFairy++;
				}
			}
			for (int i = 0; i < numBank; i++) {
				isCheck = isCheck && (money[i]>=0);
			}
			if (isCheck) {
				break;
			}
		}
		System.out.print("모든 은행의 자본을 0 이상이 되게 하는데 ");
		System.out.printf("요정의 힘을 %d회 빌렸다....",cntFairy);
		sc.close();
	}

}
