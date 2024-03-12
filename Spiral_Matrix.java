package Leetcode;
import java.util.*;

public class Spiral_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    int arr [] []= new int[n][m];
	    for(int i = 0; i<n;i++) {
	    	for(int j=i;j<m;j++) {
	    		sc.nextInt();
	    	}
	    }
	    
	    System.out.println(spiralOrder(arr));
	}
	 public static List<Integer> spiralOrder(int[][] matrix) {
	        int row = matrix.length;
	        List<Integer> ans = new ArrayList<>();
	        if(row<1){
	            return ans;
	        }
	        int col = matrix[0].length;
	        int startR = 0;
	        int startCol = 0;
	        int i =0;
	        
	        while(startR<row&& startCol<col){
	            for(i= startCol; i< col; ++i){
	                ans.add(matrix[startR][i]);
	            }
	            startR++;
	            for(i = startR; i<row;++i){
	                ans.add(matrix[i][col-1]);
	            }
	            col--;
	            if(startR<row){
	                for(i = col-1; i>=startCol;--i){
	                    ans.add(matrix[row-1][i]);
	                }
	                row--;
	            }
	            if(startCol<col){
	                for(i = row-1; i>=startR;--i){
	                    ans.add(matrix[i][startCol]);
	                }
	                startCol++;
	            }
	        }
	        return ans;
	 }
}
