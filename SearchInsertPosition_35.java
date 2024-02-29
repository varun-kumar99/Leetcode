package Leetcode;
import java.util.*;
import java.util.Scanner;

public class SearchInsertPosition_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int []A = new int[n];
		for(int i =0;i<n;i++) {
			A[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		System.out.println(searchInsert(A,  target));

	}
	 public static int searchInsert(int[] arr, int target) {
	        int count = 0;
	        int end = arr.length;
	        for (int i = 0; i < arr.length ; i++) {
				if (arr[i] == target || arr[i] > target || i == arr.length) {
					count = i;
	                break;
					
				}
	            else if( i == end-1) {
					count= i+1;
				}
	           
			}
	        return count;
	        
	    }

}
