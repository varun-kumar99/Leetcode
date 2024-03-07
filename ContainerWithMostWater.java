package Leetcode;

import java.util.Scanner;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		System.out.println(maxArea(A));
	}

	public static int maxArea(int[] height) {
		int left = 0;
		int right = height.length - 1;
		int max = 0;
		while (left < right) {
			int currentMin = Math.min(height[left], height[right]);
			max = Math.max(max, currentMin * (right - left));
			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return max;
	}

}
