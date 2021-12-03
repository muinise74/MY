package javafestival_3weeks;

import java.util.Arrays;

public class Hw3_09 {
	public static int[] mergeArray(int[] a, int[] b) {
		int[] array = new int[a.length + b.length];
		for (int i = 0; i < array.length; i++) {
			if (i < a.length) {
				array[i] = a[i];
			} else {
				array[i] = b[i-a.length];
			}
		}
		Arrays.sort(array);
		return array;
	}
	public static void main(String[] args) {
		
		int[] A = {1,3,5,7,9,11,13,15,17,19};
		int[] B = {2,4,6,8,10,12,14,16,18,20};
		System.out.print("Merge : "+ Arrays.toString(mergeArray(A,B)));
	}

}
