import java.util.Random;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// ���� �߱�
		System.out.println("���� �߱� ����");
		System.out.println("���� �ٸ� �� ���� �Է��� �ּ���.");
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
			System.out.print("ù ��° �� �Է� : ");
			input1 = sc.nextInt();
			System.out.print("�� ��° �� �Է� : ");
			input2 = sc.nextInt();
			System.out.print("�� ��° �� �Է� : ");
			input3 = sc.nextInt();
			System.out.print("�� ��° �� �Է� : ");
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
				System.out.println("�����Դϴ�."+" < Try : "+cnt+" >");
				break;
			}else {
				System.out.println("�����Դϴ�. "+"< ���� : "+strike+"S "+ball+"B >"+" < Try : "+cnt+" >");
			}
			strike = 0;
			ball = 0;
		}
		sc.close();
	}

}
