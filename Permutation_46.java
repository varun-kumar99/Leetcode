package Leetcode;

import java.util.*;

public class Permutation_46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		System.out.println(permute(A));

	}
	 static List<List<Integer>> ans = new ArrayList<>();

	   static void solve(int[] nums, int[] per, int c) {
	        if (c == nums.length) {
	            List<Integer> permutation = new ArrayList<>();
	            for (int num : per) {
	                permutation.add(num);
	            }
	            ans.add(permutation);
	            return;
	        }
	        for (int i = 0; i < nums.length; i++) {
	            if (per[i] == 11) {
	                per[i] = nums[c];
	                solve(nums, per, c + 1);
	                per[i] = 11;
	            }
	        }
	    }

	    public static List<List<Integer>> permute(int[] nums) {
	        int n = nums.length;
	        int[] per = new int[n];
	        for (int i = 0; i < n; i++) {
	            per[i] = 11;
	        }
	        solve(nums, per, 0);
	        return ans;
	    }
	    
}
