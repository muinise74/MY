package javafestival_3weeks;

import java.util.Scanner;

public class Hw3_10 {

	public static String getMiddle(String a) {
		
		String[] arr = a.split("");
		String result = "";
		if (a.length()%2 == 1) {
			result = arr[a.length()/2];
		} else {
			result = arr[a.length()/2-1]+arr[a.length()/2];
		}
		return result;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ƹ� ���̳� �Է��ϼ��� >> ");
		String input = sc.next();
		
		System.out.println(getMiddle(input));
		sc.close();
	}

}
