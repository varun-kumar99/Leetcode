package Leetcode;

import java.util.Scanner;

public class UniquePath_two_63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int m = sc.nextInt();
	    int n = sc.nextInt();
	     int [][] grid = new int[m][n];
	     for(int i=0;i<m;i++) {
	    	 for(int j=0;j<n;j++) {
	    		 grid[i][j] = sc.nextInt();
	    	 }
	     }
	     System.out.println(uniquePathsWithObstacles(grid));

	}
	 public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
	        int m = obstacleGrid.length, n = obstacleGrid[0].length;
		int[][] path = new int[m][n];

		for (int i = 0; i < m; i++) {
			if (obstacleGrid[i][0] == 1)  {
				path[i][0] = 0;
				
				break;  
			} else
				path[i][0] = 1;
		}
		
		for (int j = 0; j < n; j++) {
			if (obstacleGrid[0][j] == 1)  {
				path[0][j] = 0;
				
				break; 
			} else
				path[0][j] = 1;
		}
		
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				if (obstacleGrid[i][j] == 1) 
					path[i][j] = 0;
				else
					path[i][j] = path[i-1][j] + path[i][j-1];
			}
		}
		return path[m-1][n-1];
	    }

}
