package javafestival_3weeks;

//import java.util.Arrays;
import java.util.Scanner;

public class Hw3_03 {
	// split 함수 : String 배열 = string이름.split("") - 배열에 스트링을 한글자씩 끊어서 저장한다.
	// charAt 함수 : char[] 배열이름 = new char[스트링이름.length()] <- 배열생성
	//              배열이름[i] = (스트링이름.charAt(i)) - 배열에 스트링을 한글자씩 끊어서 저장한다.
	// Arrays.sort(배열이름) - 배열을 오름차순으로 정렬, util의 Arrays를 import 해야함..
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
		
		System.out.print("영문 문자열 입력(대소문자 구분) : ");
		String input = sc.next();
		
		System.out.println("정렬 결과 : " + reverseStr(input));
		sc.close();
	}

}
