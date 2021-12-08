package 개인연습;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		
		// 팩토리얼 0 의 개수
		
		Scanner sc = new Scanner(System.in);
		// 정수 입력
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		// 세기
		int cnt2=0, cnt5 = 0, cnt10 = 0;
		for (int i = 1; i <= num; i++) {
			if (i%2 == 0 && i % 10 != 0) {
				cnt2++;
			} else if (i%5 == 0 && i % 10 != 0) {
				cnt5++;
			} else if (i%10 == 0) {
				cnt10++;
			}
		}
		// 결과
		int cnt0 = 0;
		if (cnt2 >= cnt5) {
			cnt0 = cnt5 + cnt10;
		} else {
			cnt0 = cnt2 + cnt10;
		}
		// 출력
		System.out.println("결과 : "+cnt0);
	}

}
