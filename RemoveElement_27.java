package Leetcode;
import java.util.*;
public class RemoveElement_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] nums = new int[n];
		for (int i =0;i<n;i++) {
			nums[i] = sc.nextInt();
			
		}
		int val = sc.nextInt();
		System.out.println(removeElement( nums, val));
	}
	  public static int removeElement(int[] nums, int val) {
	        int count = 0;
	        for (int i=0; i< nums.length; i ++){
	            if (nums[i] != val){
	                nums[count++] = nums[i];
	                
	            }
	            
	        }
	        return count;
	        
	    }
}
