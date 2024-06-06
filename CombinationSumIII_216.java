package Leetcode;
import java.util.*;
public class CombinationSumIII_216 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public List<List<Integer>> combinationSum3(int k, int n) {
	        int[] arr = { 1,2,3,4,5,6,7,8,9};
	        List<Integer> list = new ArrayList<>();
			List<List<Integer>> ans = new ArrayList<>();
			print( arr,k, n,list ,ans,1);
		return ans;
	        
			

		}
		public static void print(int [] arr,int k, int n ,List<Integer> list,List<List<Integer>> ans,int idx) {
			if (list.size() == k && n == 0 ) {
				ans.add(new ArrayList<Integer>(list));
	            return;
			}
			for( int i = idx; i <=9; i++) {
				list.add(i);
				print(  arr,  k ,n -i,list , ans,i+1 );
				list.remove(list.size()-1);
				
			}
	    }

}
