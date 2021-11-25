import java.util.Random;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// 숫자 야구
		System.out.println("숫자 야구 게임");
		System.out.println("서로 다른 네 수를 입력해 주세요.");
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int strike = 0 , ball = 0, cnt = 0;
		int num1 = rd.nextInt(9)+1;
		int num2 = num1,num3 = num1,num4 = num1;
		
		while (num1 == num2) {
			num2 = rd.nextInt(9)+1;
		}
		while (num1 == num3 || num2 == num3 ) {
			num3 = rd.nextInt(9)+1;
		}
		while (num1 == num4 || num2 == num4 || num3 == num4) {
			num4 = rd.nextInt(9)+1;
		}
		int input1 = 0, input2 = 0, input3 = 0, input4 = 0;
		while (strike != 4) {
			System.out.print("첫 번째 수 입력 : ");
			input1 = sc.nextInt();
			System.out.print("두 번째 수 입력 : ");
			input2 = sc.nextInt();
			System.out.print("세 번째 수 입력 : ");
			input3 = sc.nextInt();
			System.out.print("네 번째 수 입력 : ");
			input4 = sc.nextInt();
			cnt++;
			if(input1==num1) {
				strike++;
			}else if (input1 == num2 || input1 == num3 || input1 == num4) {
				ball++;
			}
			if(input2==num2) {
				strike++;
			}else if (input2 == num1 || input2 == num3 || input2 == num4) {
				ball++;
			}
			if(input3==num3) {
				strike++;
			}else if (input3 == num1 || input3 == num2 || input3 == num4) {
				ball++;
			}
			if(input4==num4) {
				strike++;
			}else if (input4 == num1 || input4 == num2 || input4 == num3) {
				ball++;
			}
			if(strike == 4) {
				System.out.println("정답입니다."+" < Try : "+cnt+" >");
				break;
			}else {
				System.out.println("오답입니다. "+"< 현재 : "+strike+"S "+ball+"B >"+" < Try : "+cnt+" >");
			}
			strike = 0;
			ball = 0;
		}
		sc.close();
	}

}
