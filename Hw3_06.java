package javafestival_3weeks;

import java.util.Scanner;

public class Hw3_06 {
	// String���� �Է� �޾� split �޼ҵ带 Ȱ���Ͽ�����,  ���� �Է¹޾� �������� �̿��ص� �ȴ�...
	public static int dash(String a) {
		String[] arr = a.split("");
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			switch(arr[i]) {
			case "0" :
				result += 6;
				break;
			case "1" :
				result += 2;
				break;
			case "2" :
				result += 5;
				break;
			case "3" :
				result += 5;
				break;
			case "4" :
				result += 4;
				break;
			case "5" :
				result += 5;
				break;
			case "6" :
				result += 6;
				break;
			case "7" :
				result += 3;
				break;
			case "8" :
				result += 7;
				break;
			case "9" :
				result += 6;
				break;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù°�ڸ� 0�� ������ ���ڸ� �Է��� �ּ���. >> ");
		String input = sc.next();
		
		System.out.printf("���('-')�� ���� : %d",dash(input));
		sc.close();
	}

}
