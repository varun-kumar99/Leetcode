package Leetcode;

import java.util.Scanner;

public class SearchA2DMatrix_74 {

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
		int target = sc.nextInt();
		System.out.println(searchMatrix(arr,target));
	}
	public static  boolean searchMatrix(int[][] matrix, int target) {
	      int r=matrix.length, c=matrix[0].length;
	      boolean res=true;
	      for(int[] row:matrix){
	          res=search(row,target);
	          if(res) break;
	      } 
	      return res;
	    }
	     public static boolean search(int[] row,int target){
	      int l=0,r=row.length-1;
	      while(l<=r){
	          int mid=(l+r)  /2;
	            if(row[mid]==target){
	                return true;
	            }
	            else if(row[mid]>target){
	                r=mid-1;
	            }
	            else{
	                l=mid+1;
	            }
	        }
	        return false;
	        
	    }
	

}
