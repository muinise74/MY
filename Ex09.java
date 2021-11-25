import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// 베르트랑 공준
		// 자연수 n 을 입력받아 n보다 크고 2n이하의 소수를 출력하고 개수 세기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 입력 : ");
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
		System.out.println(input+"보다 크고 "+2*input+"이하인 소수의 수 : "+cnt);
		sc.close();
	}

}
