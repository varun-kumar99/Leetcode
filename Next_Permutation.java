package Leetcode;
import java.util.*;
public class Next_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int  [] nums = new int[n];
		for (int i=0; i<n; i++ ) {
			nums[i] = sc.nextInt();
		}
	nextPermutation(nums);
	for (int i=0; i<n; i++ ) {
		 System.out.print(nums[i]+" ");
	}

	}
	  public static void nextPermutation(int[] nums) {
	        if(nums == null || nums.length <= 1) return;
	      int i = nums.length - 2;
	      while(i >= 0 && nums[i] >= nums[i + 1]) i--; 
	      if(i >= 0) {                          
	        int j = nums.length - 1;           
	        while(nums[j] <= nums[i]) j--;           
	        swap(nums, i, j);                     
	    }
	    reverse(nums, i + 1, nums.length - 1);       
	}

	public static void swap(int[] nums, int i, int j) {
	    int temp = nums[i];
	    nums[i] = nums[j];
	    nums[j] = temp;
	}

	public static void reverse(int[] nums, int i, int j) {
	    while(i < j) 
	      swap(nums, i++, j--);
	    }
}
