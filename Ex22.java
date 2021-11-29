package ���ο���;

public class Ex22 {
	// ����� ��
	public static void matrixSum(int[][] a, int[][] b){
		int[][] c = new int[a.length][a[0].length];
		if (a.length == b.length && a[0].length == b[0].length) {
			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j <c[0].length; j++) {
					c[i][j] = a[i][j] + b[i][j];
					System.out.print(c[i][j]+" ");
				}
				System.out.println("");
			}
		} else {
			System.out.println("��� �Ұ�");
		}
	}
	// ����� ��
	public static void matrixProduct(int[][] a, int[][] b){
		int[][] c = new int[a.length][b[0].length];
		if (a[0].length == b.length) {
			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j < c[0].length; j++) {
					for (int k = 0; k < a[0].length; k++) {
						c[i][j] += a[i][k]*b[k][j];
					}
					System.out.print(c[i][j]+" ");
				}
				System.out.println("");
			}
		} else {
			System.out.println("��� �Ұ�");
		}
	}
	
	public static void main(String[] args) {
		int[][] a = {{1,0},{0,1}};
		int[][] b = {{0,1},{1,0}};
		int[][] c = {{1,2},{3,4},{5,6}};
		int[][] d = {{1},{2}};
		matrixSum(a,b);
		matrixProduct(a,b);
		matrixProduct(c,d);
		matrixSum(a,d); // ����� ũ�Ⱑ �޶� �Ի�Ұ�
		matrixProduct(a,c); // ��� a �� ���� ���� ��� c�� ���� ���� �޶� �Ի� �Ұ�
	}

}
