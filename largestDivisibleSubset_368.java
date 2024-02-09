package Leetcode;
import java.util.*;
public class largestDivisibleSubset_368 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int[n];
		
	for (int i =0;i<n;i++) {
		nums[i] = sc.nextInt();
	}
	System.out.println(largestDivisibleSubset(nums));
	}
	public static List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
       int[] dp = new int[n];
       Arrays.fill(dp, 1);
       Arrays.sort(nums);
       
       int maxSize = 1, maxIndex = 0;
       for (int i = 1; i < n; i++) {
           for (int j = 0; j < i; j++) {
               if (nums[i] % nums[j] == 0) {
                   dp[i] = Math.max(dp[i], dp[j] + 1);
                   if (dp[i] > maxSize) {
                       maxSize = dp[i];
                       maxIndex = i;
                   }
               }
           }
       }
       
       List<Integer> result = new ArrayList<>();
       int num = nums[maxIndex];
       for (int i = maxIndex; i >= 0; i--) {
           if (num % nums[i] == 0 && dp[i] == maxSize) {
               result.add(nums[i]);
               num = nums[i];
               maxSize--;
           }
       }
       
       return result;

}
}
