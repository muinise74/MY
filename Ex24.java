package ���ο���;

import java.util.Arrays;
import java.util.Scanner;

public class Ex24 {
	
	public static void anagram(String a, String b) {
		String[] arrA = a.split("");
		String[] arrB = b.split("");
		
		Arrays.sort(arrA);
		Arrays.sort(arrB);
		
		if (Arrays.deepEquals(arrA,arrB)) {
			System.out.printf("%s�� %s�� �ֳʱ׷��Դϴ�.",a,b);
		} else {
			System.out.printf("%s�� %s�� �ֳʱ׷��� �ƴմϴ�.",a,b);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���ڿ� �Է� : ");
		String input1 = sc.next();
		System.out.print("�ι�° ���ڿ� �Է� : ");
		String input2 = sc.next();
		
		sc.close();
		anagram(input1,input2);
	}

}
