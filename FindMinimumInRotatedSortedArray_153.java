package Leetcode;

import java.util.Scanner;

public class FindMinimumInRotatedSortedArray_153{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num[] = new int[n];
		for(int i =0; i< n;i++) {
			num[i] = sc.nextInt();
		}
		System.out.println(findMin(num));

	}
	 public static int findMin(int[] num) {
         if (num == null || num.length == 0) {
           return 0;
       }
       if (num.length == 1) {
           return num[0];
       }
       int start = 0, end = num.length - 1;
       while (start < end) {
           int mid = (start + end) / 2;
           if (mid > 0 && num[mid] < num[mid - 1]) {
               return num[mid];
           }
           if (num[start] <= num[mid] && num[mid] > num[end]) {
               start = mid + 1;
           } else {
               end = mid - 1;
           }
       }
       return num[start];
   }

}
