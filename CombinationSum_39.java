package Leetcode;
import java.util.*;
import java.util.Scanner;

public class CombinationSum_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int []A = new int[n];
		for(int i =0;i<n;i++) {
			A[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		System.out.println(combinationSum(A,  target));

	}
	 public static  List<List<Integer>> combinationSum(int[] candidates, int target) {
	        List<Integer> list = new ArrayList<>();
			List<List<Integer>> ans = new ArrayList<>();
			print(candidates,target,list,ans,0);
			return ans;
			
			
			
		}
		public static void print(int[] ques, int target, List<Integer> list,List<List<Integer>> ans,int idx) {
			if(target == 0) {
				ans.add(new ArrayList<Integer>(list));
				return;
			}
			for (int i = idx ; i <ques.length; i++) {
				if(target >= ques[i]) {
					list.add(ques[i]);
					print(ques,target-ques[i],list,ans,i);
					list.remove(list.size() - 1);
					
				}
			}

}}
