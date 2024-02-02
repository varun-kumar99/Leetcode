package Leetcode;
import java.util.*;
public class twosum_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		twosum_1 solution = new twosum_1();

		// Calling the twoSum method
		int[] result = twosum_1.twosum(nums, target);

		System.out.println("Result: [" + result[0] + ", " + result[1] + "]");
	}

	private static int[] twosum(int[] nums, int target) {
		int[] result = new int[2];

		Map<Integer, Integer> visited = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (visited.containsKey(target - nums[i])) {
				result[0] = visited.get(target - nums[i]);
				result[1] = i;
				return result;
			}
			visited.put(nums[i], i);
		}

		return result;

	}

}
