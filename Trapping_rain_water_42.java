package Leetcode;

import java.util.*;

public class Trapping_rain_water_42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		System.out.println(trap(A));
	}
	  public static int trap(int[] arr) {
	        int n = arr.length;
			int left[] = new int[n];
			int right[] = new int[n];
			left[0] = arr[0];
			for (int i = 1; i < n; i++) {
				left[i] = Math.max(left[i - 1], arr[i]) ;
			}
			right[n - 1] = arr[n-1];
			for (int i = n - 2; i >= 0; i--) {
				right[i] = Math.max(right[i + 1], arr[i]);

			}
			int ans = 0;
			for (int i = 0; i < n; i++) {

				ans = ans + (Math.min(left[i],right[i]))- arr[i];
			}
			return ans;

	        
	    }

}
