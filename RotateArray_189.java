package Leetcode;

import java.util.*;

public class RotateArray_189 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0; i <n;i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		rotate(arr, k);

	}
	 private static void reverse(int arr[], int start, int end)
	    {
	        while(start < end)
	        {
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            
	            start++;
	            end--;
	        }
	    }
	    
	    public static void rotate(int[] nums, int k) {
	        int n = nums.length;
	        if(n ==1)
	        {
	            return;
	        }
	        reverse(nums, 0, n-(k%n)-1);
	        reverse(nums,n-(k%n), n-1);
	        reverse(nums, 0, n-1);
	    }

}
