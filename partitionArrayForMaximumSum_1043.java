package Leetcode;

import java.util.*;

public class partitionArrayForMaximumSum_1043 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		System.out.println(maxSumAfterPartitioning(nums,k));
	}

	public static int maxSumAfterPartitioning(int[] arr, int k) {

		int n = arr.length;

		int[] dp = new int[n + 1];

		for (int i = 0; i < n; i++) {
			int curMax = 0, curSum = 0;

			for (int j = i; j >= Math.max(0, i - k + 1); j--) {

				curMax = Math.max(curMax, arr[j]);

				int cur = curMax * (i - j + 1) + dp[j];

				curSum = Math.max(curSum, cur);
			}

			dp[i + 1] = curSum;
		}

		return dp[n];

	}
}
