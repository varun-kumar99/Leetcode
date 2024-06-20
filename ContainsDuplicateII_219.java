package Leetcode;
import java.util.*;
public class ContainsDuplicateII_219 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] nums = new int[n];
		for (int i = 0; i<n; i++) {
			nums[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		System.out.println(containsNearbyDuplicate(nums, k));

	}
	 public static boolean containsNearbyDuplicate(int[] nums, int k) {
         HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
           if(mp.containsKey(nums[i])){
               if(Math.abs(i-mp.get(nums[i]))<=k) return true;
           }
           mp.put(nums[i],i);
        }
        return false;

}
}