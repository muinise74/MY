package 개인연습;

import java.util.Arrays;
import java.util.Scanner;

public class Ex24 {
	
	public static void anagram(String a, String b) {
		String[] arrA = a.split("");
		String[] arrB = b.split("");
		
		Arrays.sort(arrA);
		Arrays.sort(arrB);
		
		if (Arrays.deepEquals(arrA,arrB)) {
			System.out.printf("%s와 %s는 애너그램입니다.",a,b);
		} else {
			System.out.printf("%s와 %s는 애너그램이 아닙니다.",a,b);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 문자열 입력 : ");
		String input1 = sc.next();
		System.out.print("두번째 문자열 입력 : ");
		String input2 = sc.next();
		
		sc.close();
		anagram(input1,input2);
	}

}
