package Leetcode;

import java.util.Scanner;

public class Maximum_subarray_53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		System.out.println(maxSubArray(A) );
	}
		 public static int maxSubArray(int[] arr) {
		       int ans = Integer.MIN_VALUE;// -2^31
				int curr = 0;
				for (int i = 0; i < arr.length; i++) {
					curr = curr + arr[i];
					ans = Math.max(ans, curr);
					if (curr < 0) {
						curr = 0;
					}
				}
				return ans;


	}

}
