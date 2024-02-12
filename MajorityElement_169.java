package Leetcode;
import java.util.*;
public class MajorityElement_169 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0; i <n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(majorityElement(arr));
	}
	public static int majorityElement(int[] nums) {
	       Map<Integer, Integer> map = new HashMap<>();
	        int n = nums.length / 2;

	        for (int num : nums) {
	            map.put(num, map.getOrDefault(num, 0) + 1);
	        }

	        int ans = 0;

	        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	            if (entry.getValue() > n) {
	                ans = entry.getKey();
	                break;
	            }
	        }

	        return ans;
	    }

}
