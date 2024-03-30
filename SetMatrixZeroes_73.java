package Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class SetMatrixZeroes_73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [][]arr = new int[n][m];
		for (int i =0;i<n;i++) {
			for(int j =0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		setZeroes(arr);
	}
	 public static  void setZeroes(int[][] matrix) {
	        int m = matrix.length, n = matrix[0].length, k = 0;
	    // First row has zero?
	    while (k < n && matrix[0][k] != 0) ++k;
	    // Use first row/column as marker, scan the matrix
	    for (int i = 1; i < m; ++i)
	        for (int j = 0; j < n; ++j)
	            if (matrix[i][j] == 0)
	                matrix[0][j] = matrix[i][0] = 0;
	    // Set the zeros
	    for (int i = 1; i < m; ++i)
	        for (int j = n - 1; j >= 0; --j)
	            if (matrix[0][j] == 0 || matrix[i][0] == 0)
	                matrix[i][j] = 0;
	    // Set the zeros for the first row
	    if (k < n) Arrays.fill(matrix[0], 0);

}
}
