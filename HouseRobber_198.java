package Leetcode;
import java.util.*;


public class HouseRobber_198 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] nums = new int[n];
		for ( int i = 0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println(rob(nums));

	}
	 public static int rob(int[] nums) {
         int rob = 0;
        int norob = 0;
        for (int i = 0; i < nums.length; i ++) {
            int newRob = norob + nums[i];
            int newNoRob = Math.max(norob, rob);
            rob = newRob;
            norob = newNoRob;
        }
        return Math.max(rob, norob);
    }

}
