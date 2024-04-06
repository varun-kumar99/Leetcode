package Leetcode;
import java.util.*;
public class RemoveDuplicatesFromSortedArray2_80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n  = sc.nextInt();
		int [] arr = new int[n];
		
		for(int i = 0; i<n ; i++) {
			arr[i] = sc.nextInt();
			
		}
		System.out.println(removeDuplicates(arr));

	}
	 public static int removeDuplicates(int[] nums) {
	       
		   int i = 0;
		   for (int n : nums)
		      if (i < 2 || n > nums[i - 2])
		         nums[i++] = n;
		   return i;
		    }

}
