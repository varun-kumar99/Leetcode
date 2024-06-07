package Leetcode;
import java.util.*;
public class ContainsDuplicate_217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] nums = new int[n];
		for (int i = 0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println(containsDuplicate(nums));

	}
	  public static boolean containsDuplicate(int[] nums) {
	        Set<Integer> set = new HashSet<>();

	    for (Integer i: nums){
	        if (!set.add(i))
	            return true;
	    }

	    return false;
	    }

}
