package Leetcode;
import java.util.*;
public class SearchInRotatedSortedArray_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int []A = new int[n];
		for(int i =0;i<n;i++) {
			A[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		System.out.println(search(A,  target));

	}
	  public static int search(int[] A, int target) {
	         int lo = 0;
	    int hi = A.length - 1;
	    while (lo < hi) {
	        int mid = (lo + hi) / 2;
	        if (A[mid] == target) return mid;
	        
	        if (A[lo] <= A[mid]) {
	            if (target >= A[lo] && target < A[mid]) {
	                hi = mid - 1;
	            } else {
	                lo = mid + 1;
	            }
	        } else {
	            if (target > A[mid] && target <= A[hi]) {
	                lo = mid + 1;
	            } else {
	                hi = mid - 1;
	            }
	        }
	    }
	    return A[lo] == target ? lo : -1;
	    }

}
