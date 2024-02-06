package Leetcode;

import java.util.*;

public class MedianOfTwoSortedAray_04 {
	  static private int p1 = 0, p2 = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int[] nums1 = new int[m];
		for (int i = 0; i < m; i++) {
			nums1[i] = sc.nextInt();
		}
		int n = sc.nextInt();
		int[] nums2 = new int[n];
		for (int j = 0; j < n; j++) {
			nums2[j] = sc.nextInt();
		}
	
		System.out.println(findMedianSortedArrays(nums1,nums2));
	}
	
		 private static int getMin(int[] nums1, int[] nums2) {
		        if (p1 < nums1.length && p2 < nums2.length) {
		            return nums1[p1] < nums2[p2] ? nums1[p1++] : nums2[p2++];
		        } else if (p1 < nums1.length) {
		            return nums1[p1++];
		        } else if (p2 < nums2.length) {
		            return nums2[p2++];
		        } 
		        return -1;
		    }
		    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		        int m = nums1.length, n = nums2.length;
		        if ((m + n) % 2 == 0) {
		            for (int i = 0; i < (m + n) / 2 - 1; ++i) {
		                int tmp = getMin(nums1, nums2);
		            }
		            return (double)(getMin(nums1, nums2) + getMin(nums1, nums2)) / 2;
		        } else {
		            for (int i = 0; i < (m + n) / 2; ++i) {
		                int tmp = getMin(nums1, nums2);
		            }
		            return getMin(nums1, nums2);

	}

}
}
