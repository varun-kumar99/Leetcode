package Leetcode;
import java.util.*;
import java.util.Scanner;

public class LongestConsecutiveSequence_128 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		 System.out.println(longestConsecutive(arr));

	}
	 public static int longestConsecutive(int[] arr) {
	        HashMap<Integer, Boolean> map = new HashMap<>();
			for (int i = 0; i < arr.length; i++) {

				if (map.containsKey(arr[i] - 1)) {
					map.put(arr[i], false);
				} else {
					map.put(arr[i], true);
				}

				if (map.containsKey(arr[i] + 1)) {
					map.put(arr[i] + 1, false);
				}

			}

			int ans = 0;
			for (int key : map.keySet()) {

				if (map.get(key) == true) {
					int count = 0;
					while (map.containsKey(key)) {
						count++;
						key++;
					}

					ans = Math.max(ans, count);

				}

			}
			return ans;
	    }

}
