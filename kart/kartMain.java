package kart;

import java.util.Scanner;

public class kartMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MyKart sportage = new MyKart();
		sportage.show();
		
		while (sportage.myPosition <= 100) {
			System.out.print("[1. 전진 2. 후진 3. 부스터] ");
			int input = sc.nextInt();
			switch(input) {
				case 1 :
					sportage.accel(10);
					sportage.show();
					break;
				case 2 :
					sportage.back(10);
					sportage.show();
					break;
				case 3 :
					sportage.booster(30);
					sportage.show();
					break;
			}
		}
		sc.close();
	}

}
