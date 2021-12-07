package 개인연습;

public class Heart {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i==1 && (j >= 2 && j <= 6 && j !=4)) {
					System.err.print("*");
				} else if (i >= 2 && i <= 4) {
					System.err.print("*");
				} else if (i == 5 & j >= 2 && j <= 6){
					System.err.print("*");
				} else if (i == 6 & j >= 3 && j <= 5){
					System.err.print("*");
				} else if (i == 7 & j == 4){
					System.err.print("*");
				} else {
					System.err.print(" ");
				}
					
			}
			System.err.println();
		}
	}

}
