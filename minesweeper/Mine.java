package minesweeper;

import java.util.Random;

public class Mine {

	char[][] mine = new char[MineSweeper.size+2][MineSweeper.size+2];

	public char[][] mine() {
		// ����ã�� 30X30 ���� 150�� ����
		// ���� ����
		int[] iArray = new int[MineSweeper.totalmine];
		int[] jArray = new int[MineSweeper.totalmine];

		Random rd = new Random();
		for (int i = 0; i < iArray.length; i++) {
			iArray[i] = rd.nextInt(MineSweeper.size) + 1;
			jArray[i] = rd.nextInt(MineSweeper.size) + 1;
			mine[iArray[i]][jArray[i]] = '*';
		}
		// �����¿� �밢�� 1ĭ ���� ���� ����
		for (int i = 1; i <= MineSweeper.size; i++) {
			for (int j = 1; j <= MineSweeper.size; j++) {
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
		for (int i = 0; i < MineSweeper.size+2; i++) {
			for (int j = 0; j < MineSweeper.size+2; j++) {
				if (mine[i][j] == '*') {
					cnt++;
				}
			}
		}
		return cnt;
	}

}
