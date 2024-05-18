package Leetcode;
import java.util.*;
public class TwoSum2InputArrayIsSorted_167 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int []nums = new int[n];
		for (int i =0;i<n;i++) {
			nums[i]= sc.nextInt();
		}
		int target = sc.nextInt();
		System.out.println(twoSum(nums,target));
	}
	public static int[] twoSum(int[] nums, int target) {
        for(int left = 0;  left < nums.length; left++){
           int right = binary(nums, left + 1, target - nums[left]);
           if(right != -1){
               return new int[]{left + 1, right + 1};
           }
       }        
       return new int[]{};
   }
   
   private static int binary(int[] nums, int left, int target) {
       int right = nums.length - 1;
       while(left <= right){
           int mid = (right + left)>>1;
           if(nums[mid] == target){
               return mid;
           } else if (nums[mid] < target){
               left = mid + 1;
           } else {
               right = mid - 1;
           }
       }
       return -1;
   }

}
