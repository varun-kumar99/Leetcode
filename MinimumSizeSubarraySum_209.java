package Leetcode;
import java.util.*;
public class MinimumSizeSubarraySum_209 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] nums = new int[n];
		for (int i = 0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		System.out.println(minSubArrayLen(target, nums));

	}
	  public static int minSubArrayLen(int target, int[] nums) {
	         if(nums==null || nums.length==0) return 0;
	      int i=0,j=0,sum=0,min=Integer.MAX_VALUE;
	      while(j<nums.length){
	          sum+=nums[j++];
	          while(sum>=target){
	              min = Math.min(min, j - i);
	              sum-=nums[i++];
	          }
	      }
	         return min == Integer.MAX_VALUE ? 0 : min;
	    }

}
