package Leetcode;
import java.util.*;
public class Remove_Element_27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []nums = new int[n];
		for(int i =0; i<n;i++) {
			nums[i] = sc.nextInt();
		}
		int val = sc.nextInt();
		
		remove(nums, val);
	}
		public static int[] remove(int[]nums , int val) {
			int index = 0;
	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] != val) {
	                nums[index] = nums[i];
	                index++;
	            }
	        }
	        return index;
			
			
			
		}

			
		

	}

}
