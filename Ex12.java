import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// 마방진 - 홀수 magic square 2자리까지만 입력해줘....
		Scanner sc = new Scanner(System.in);
		System.out.print("홀수 입력(부탁인데 2자리 까지만 입력해줘.....) : ");
		int odd = sc.nextInt();
		// 배열 생성 및 임시값 지정
		int[][] ms = new int[odd + 2][odd + 2];
		for (int a = 0; a < odd + 2; a++) {
			for (int b = 0; b < odd + 2; b++) {
				if (a == 0 || b == 0 || a == odd + 1 || b == odd + 1) {
					ms[a][b] = 1;
				} else {
					ms[a][b] = 0;
				}
			}
		}
		// 마방진 작성
		int i = 1, j = (odd + 1) / 2, n = 1;
		while (i >= 1 && i <= odd && j >= 1 && j <= odd) {
			ms[i][j] = n;
			if (i == 1) {
				if (ms[odd][j + 1] == 0) {
					j++;
					i = odd;
				} else {
					i++;
				}
			} else if (j == odd) {
				if (ms[i - 1][1] == 0) {
					i--;
					j = 1;
				} else {
					i++;
				}
			} else {
				if (ms[i - 1][j + 1] != 0) {
					i++;
				} else {
					i--;
					j++;
				}
			}
			n++;
			if (n > odd * odd) {
				break;
			}
		}
		// 마방진 출력
		if (n - 1 >= 1000) {
			for (int a = 1; a < odd + 1; a++) {
				for (int b = 1; b < odd + 1; b++) {
					if (ms[a][b] < 10) {
						System.out.print("000" + ms[a][b] + " ");
					} else if (ms[a][b] < 100) {
						System.out.print("00" + ms[a][b] + " ");
					} else if (ms[a][b] < 1000) {
						System.out.print("0" + ms[a][b] + " ");
					} else {
						System.out.print(ms[a][b] + " ");
					}
				}
				System.out.println("");
			}
		} else if (n - 1 >= 100) {
			for (int a = 1; a < odd + 1; a++) {
				for (int b = 1; b < odd + 1; b++) {
					if (ms[a][b] < 10) {
						System.out.print("00" + ms[a][b] + " ");
					} else if (ms[a][b] < 100) {
						System.out.print("0" + ms[a][b] + " ");
					} else {
						System.out.print(ms[a][b] + " ");
					}
				}
				System.out.println("");
			}
		} else if (n - 1 >= 10) {
			for (int a = 1; a < odd + 1; a++) {
				for (int b = 1; b < odd + 1; b++) {
					if (ms[a][b] < 10) {
						System.out.print("0" + ms[a][b] + " ");
					} else {
						System.out.print(ms[a][b] + " ");
					}
				}
				System.out.println("");
			}
		} else {
			for (int a = 1; a < odd + 1; a++) {
				for (int b = 1; b < odd + 1; b++) {
					System.out.print(ms[a][b] + " ");
				}
				System.out.println("");
			}
		}

		// 검산 : 출력값이 마방진이 맞는지 체크해주는 부분
		// 행의 합
		for (int a = 1; a <= odd; a++) {
			int sum = 0;
			for (int b = 1; b <= odd; b++) {
				sum += ms[a][b];
			}
			System.out.printf("행%d의 합 : %d\n", a, sum);
		}
		// 열의 합
		for (int b = 1; b <= odd; b++) {
			int sum = 0;
			for (int a = 1; a <= odd; a++) {
				sum += ms[a][b];
			}
			System.out.printf("열%d의 합 : %d\n", b, sum);
		}
		// 대각선의 합 1
		int sum1 = 0;
		for (int b = 1; b <= odd; b++) {
			for (int a = 1; a <= odd; a++) {
				if (a == b) {
					sum1 += ms[a][b];
				}
			}
		}
		System.out.println("대각선1의 합 : " + sum1);
		// 대각선의 합2
		int sum2 = 0;
		for (int b = 1; b <= odd; b++) {
			for (int a = 1; a <= odd; a++) {
				if (a + b == odd + 1) {
					sum2 += ms[a][b];
				}
			}
		}
		System.out.println("대각선1의 합 : " + sum2);
	}

}
