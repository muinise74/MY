package 개인연습;

public class Ex22 {
	// 행렬의 합
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
			System.out.println("계산 불가");
		}
	}
	// 헹렬의 곱
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
			System.out.println("계산 불가");
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
		matrixSum(a,d); // 행렬의 크기가 달라 게산불가
		matrixProduct(a,c); // 행렬 a 의 열의 수와 행렬 c의 행의 수가 달라 게산 불가
	}

}
