package minesweeper;

import java.util.Random;

public class Mine {

	char[][] mine = new char[32][32];

	public char[][] mine() {
		// Áö·ÚÃ£±â 30X30 Áö·Ú 150°³ ÀÌÇÏ
		// Áö·Ú »ı¼º
		int[] iArray = new int[150];
		int[] jArray = new int[150];

		Random rd = new Random();
		for (int i = 0; i < iArray.length; i++) {
			iArray[i] = rd.nextInt(30) + 1;
			jArray[i] = rd.nextInt(30) + 1;
			mine[iArray[i]][jArray[i]] = '*';
		}
		// »óÇÏÁÂ¿ì ´ë°¢¼± 1Ä­ ³»ÀÇ Áö·Ú ¼¼±â
		for (int i = 1; i <= 30; i++) {
			for (int j = 1; j <= 30; j++) {
				char cnt = '0';
				if (mine[i][j] == '*') {
				} else {
					for (int k = -1; k <= 1; k++) {
						for (int l = -1; l <= 1; l++) {
							if (i == 0 && j == 0) {
							} else if (mine[i + k][j + l] == '*') {
								cnt++;
							}
						}
					}
					mine[i][j] = cnt;
				}
			}
		}
		return mine;
	}

	public int cntMine() {
		int cnt = 0;
		for (int i = 0; i < 32; i++) {
			for (int j = 0; j < 32; j++) {
				if (mine[i][j] == '*') {
					cnt++;
				}
			}
		}
		return cnt;
	}

}
