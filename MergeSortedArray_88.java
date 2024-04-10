package Leetcode;
import java.util.*;
public class MergeSortedArray_88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[]nums1 = new int[a];
		for(int i=0;i<a;i++) {
			nums1[i]= sc.nextInt();
		}
		int[]nums2 = new int[b];
		for(int i=0;i<b;i++) {
			nums2[i]= sc.nextInt();
		}
		int m= sc.nextInt();
		int n= sc.nextInt();
		merge( nums1,n,nums2,m);

	}
	 public static void merge(int[] arr1, int n, int[] arr2, int m) {
		int[] ans = new int[n + m];
		int i = 0;// arr1
		int j = 0;// arr2
		int k = 0;// ans

		while (i < n && j < m) {

			if (arr1[i] <= arr2[j]) {
				ans[k] = arr1[i];
				k++;
				i++;
			} else {
				ans[k] = arr2[j];
				j++;
				k++;
			}

		}
		while (i < n) {
			ans[k] = arr1[i];
			k++;
			i++;
		}

		while (j < m) {
			ans[k] = arr2[j];
			j++;
			k++;
		}
        		System.out.println(Arrays.toString(ans));
//     i=0;
//      for(int val : ans){
//          arr1[i++]=val;
//      }
		
		
	}

}
