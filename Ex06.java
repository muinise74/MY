import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// ���ͺб��� - ��Ʈ�� -
		// ��� : input1, 1��: ���� ��� : input2 ��Ʈ�� ���� : input3 
		Scanner sc = new Scanner(System.in);
		System.out.print("��� : ");
		long input1 = sc.nextInt();
		System.out.print("1�� ����� : ");
		long input2 = sc.nextInt();
		System.out.print("���� : ");
		long input3 = sc.nextInt();
		
		int cnt = 1;
		while(true) {
			if(input1+cnt*input2<cnt*input3) {
				break;
			}else
				cnt++;
		}
		System.out.println("���� �б��� : "+cnt);
		sc.close();
	}

}
