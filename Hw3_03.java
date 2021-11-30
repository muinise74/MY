package javafestival_3weeks;

//import java.util.Arrays;
import java.util.Scanner;

public class Hw3_03 {
	// split �Լ� : String �迭 = string�̸�.split("") - �迭�� ��Ʈ���� �ѱ��ھ� ��� �����Ѵ�.
	// charAt �Լ� : char[] �迭�̸� = new char[��Ʈ���̸�.length()] <- �迭����
	//              �迭�̸�[i] = (��Ʈ���̸�.charAt(i)) - �迭�� ��Ʈ���� �ѱ��ھ� ��� �����Ѵ�.
	// Arrays.sort(�迭�̸�) - �迭�� ������������ ����, util�� Arrays�� import �ؾ���..
	public static String reverseStr(String a) {
		
//		String [] arr = a.split("");
//		Arrays.sort(arr);
//		String result = "";
//		for (int i = 0; i < arr.length; i++) {
//			result += arr[i];
//		}
//		return result;
		
		char[] arr = new char[a.length()];
		for (int i = 0; i < a.length(); i++) {
			arr[i] = (a.charAt(i));
		}
		
		for (int i = 0; i < a.length(); i++) {
			char min = arr[i];
			for (int j = i+1; j < a.length(); j++) {
				if (arr[j] < min) {
					min = arr[j];
					arr[j] = arr[i];
					arr[i] = min;
				}
			}
		}
		
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���ڿ� �Է�(��ҹ��� ����) : ");
		String input = sc.next();
		
		System.out.println("���� ��� : " + reverseStr(input));
		sc.close();
	}

}
