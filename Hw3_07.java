package javafestival_3weeks;

import java.util.Scanner;

public class Hw3_07 {
	
	public static void score(String a) {
		String[] arr = a.split("");
		
		int cntA = 0, cntB = 0, cntC = 0, cntD = 0, cntF = 0;
		
		for (int i = 0; i < arr.length; i++) {
			switch(arr[i]) {
				case "A" :
					cntA++;
					break;
				case "B" :
					cntB++;
					break;
				case "C" :
					cntC++;
					break;
				case "D" :
					cntD++;
					break;
				case "F" :
					cntF++;
					break;
			}
		}
		System.out.printf("A : %d��\n",cntA);
		System.out.printf("B : %d��\n",cntB);
		System.out.printf("C : %d��\n",cntC);
		System.out.printf("D : %d��\n",cntD);
		System.out.printf("F : %d��\n",cntF);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		String score = sc.next();
		
		score(score);
		sc.close();
	}

}
