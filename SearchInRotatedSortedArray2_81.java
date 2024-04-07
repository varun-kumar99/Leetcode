package Leetcode;
import java.util.*;
public class SearchInRotatedSortedArray2_81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n  = sc.nextInt();
		int [] arr = new int[n];
		
		for(int i = 0; i<n ; i++) {
			arr[i] = sc.nextInt();
			
		}
		int target  = sc.nextInt();
		System.out.println(search(arr,target));

	}
	 public static boolean search(int[] nums, int target) {
         int start = 0, end = nums.length - 1, mid = -1;
       while(start <= end) {
           mid = (start + end) / 2;
           if (nums[mid] == target) {
               return true;
           }
          
           if (nums[mid] < nums[end] || nums[mid] < nums[start]) {
               if (target > nums[mid] && target <= nums[end]) {
                   start = mid + 1;
               } else {
                   end = mid - 1;
               }
          
           } else if (nums[mid] > nums[start] || nums[mid] > nums[end]) {
               if (target < nums[mid] && target >= nums[start]) {
                   end = mid - 1;
               } else {
                   start = mid + 1;
               }
          
           } else {
               end--;
           }
       }
       
       return false;
   }

}
