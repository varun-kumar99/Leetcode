package Leetcode;

import java.util.*;

public class Subset2_90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int[]nums = new int[a];
		for(int i=0;i<a;i++) {
			nums[i]= sc.nextInt();
		}
		System.out.println(subsetsWithDup(nums));
	}
	  public static List<List<Integer>> subsetsWithDup(int[] nums) {
	        List<List<Integer>> ans = new ArrayList<>();
			List<Integer> list = new ArrayList<>();
			Arrays.sort(nums);
			
			
			
			print(nums,list,ans,0);
			return ans;
			
			

		}
		public static void print( int [] nums, List<Integer> list, List<List<Integer>> ans,int idx) {
			if( nums == null || nums.length == 0) {
				ans.add(new ArrayList<Integer>(list));
				
			}
			
				ans.add(new ArrayList<Integer>(list));
			
			
				
			for( int i = idx; i<nums.length; i++) {
				if(i!=idx && nums[i] == nums[i-1]) {
					continue;
				}
					list.add(nums[i]);
					print(nums,list,ans,i+1 );
					list.remove(list.size()-1);
				
			}
	    }

}
