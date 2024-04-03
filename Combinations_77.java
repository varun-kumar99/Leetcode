package Leetcode;

import java.util.*;

public class Combinations_77 {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		System.out.println(combine(n,k));
	}
	 public static List<List<Integer>> combine(int n, int k) {
	        boolean []board = new boolean[n];
	        List<Integer> list = new ArrayList<>();
			List<List<Integer>> ans = new ArrayList<>();
			print ( board,k,0,0,list,ans);
			return ans;
			
			

		}
		public static void print(boolean[] board, int k,int kpsf,int idx, List<Integer> list,List<List<Integer>> ans) {
			if(k == kpsf) {
				ans.add(new ArrayList<Integer>(list));
				return;
			}
			for(int i = idx; i < board.length; i++) {
				if( board[i]== false) {
					board[i]=true;
					list.add(i+1);
					
					print(board, k,kpsf+1,i+1,list,ans);
					list.remove(list.size()-1);
					board[i]=false;
				}
			}
	        
		}
}
