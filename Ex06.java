import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		// 운영비 : input1, 1대: 생산 비용 : input2 노트북 가격 : input3 
		Scanner sc = new Scanner(System.in);
		System.out.print("운영비 : ");
		long input1 = sc.nextInt();
		System.out.print("1대 생산비 : ");
		long input2 = sc.nextInt();
		System.out.print("가격 : ");
		long input3 = sc.nextInt();
		
		int cnt = 1;
		while(true) {
			if(input1+cnt*input2<cnt*input3) {
				break;
			}else
				cnt++;
		}
		System.out.println("손익 분기점 : "+cnt);
		sc.close();
	}

}
