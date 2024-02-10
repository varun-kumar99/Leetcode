package Leetcode;
import java.util.*;
public class threeSum_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(threeSum(arr));
	}
	 public static List<List<Integer>> threeSum(int[] nums) {
	        Arrays.sort(nums);
	    List<List<Integer>> list = new ArrayList<List<Integer>>();
	    for(int i = 0; i < nums.length-2; i++) {
	        if(i > 0 && (nums[i] == nums[i-1])) continue; // avoid duplicates
	        for(int j = i+1, k = nums.length-1; j<k;) {
	            if(nums[i] + nums[j] + nums[k] == 0) {
	                list.add(Arrays.asList(nums[i],nums[j],nums[k]));
	                j++;k--;
	                while((j < k) && (nums[j] == nums[j-1]))j++;// avoid duplicates
	                while((j < k) && (nums[k] == nums[k+1]))k--;// avoid duplicates
	            }else if(nums[i] + nums[j] + nums[k] > 0) k--;
	            else j++;
	        }
	    }
	    return list;
	 }

}
