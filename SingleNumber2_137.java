package Leetcode;
import java.util.*;
import java.util.Scanner;

public class SingleNumber2_137 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []nums = new int[n];
		for(int i =0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println(singleNumber(nums));
	}
	  public static int singleNumber(int[] nums) {
	         Map<Integer, Integer> map = new HashMap<>();
	        
	        for (int x : nums) {
	            map.put(x, map.getOrDefault(x, 0) + 1);
	        }

	        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	            if (entry.getValue() == 1) {
	                return entry.getKey();
	            }
	        }
	        
	        return -1;
	    }

}
