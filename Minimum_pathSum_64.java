package Leetcode;

import java.util.Scanner;

public class Minimum_pathSum_64 {

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
	     System.out.println(minPathSum(grid));

	}
	 public static int minPathSum(int[][] grid) {
	        
         int height = grid.length;
         int width = grid[0].length;
         for (int row = 0; row < height; row++) {
             for (int col = 0; col < width; col++) {
                 if(row == 0 && col == 0) grid[row][col] = grid[row][col];
                 else if(row == 0 && col != 0) grid[row][col] = grid[row][col] + grid[row][col - 1];
                 else if(col == 0 && row != 0) grid[row][col] = grid[row][col] + grid[row - 1][col];
                 else grid[row][col] = grid[row][col] + Math.min(grid[row - 1][col], grid[row][col - 1]);
             }
         }
         return grid[height - 1][width - 1];
 }

}
