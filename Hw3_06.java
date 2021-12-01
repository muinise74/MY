package javafestival_3weeks;

import java.util.Scanner;

public class Hw3_06 {
	// String으로 입력 받아 split 메소드를 활용하였으나,  수로 입력받아 나머지를 이용해도 된다...
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
		System.out.print("첫째자리 0을 제외한 숫자를 입력해 주세요. >> ");
		String input = sc.next();
		
		System.out.printf("대시('-')의 총합 : %d",dash(input));
		sc.close();
	}

}
