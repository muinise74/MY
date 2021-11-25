import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// 골드바흐의 추측 : 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("4 이상의 짝수 입력 : ");
		int input = sc.nextInt();
		int p1 = 0, p2 = 0;
		for (int i = input/2; i > 1; i--) {
			for (int j = 2; j <= i; j++) {
				if (i%j==0) {
					if (i==j) {
						p1 = i;
					}else {
						break;
					}
				}
			}
			for (int j = 2; j <= input - i; j++) {
				if ((input - i)%j==0) {
					if (j==input - i) {
						p2 = input - i;
					}else {
						break;
					}
				}
			}
			if (p1 != 0 && p2 != 0) {
				System.out.println(input + " = " + p1 + " + " + p2);
				break;
			}
		}
		sc.close();
	}

}
