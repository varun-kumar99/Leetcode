package Leetcode;
import java.util.*;
public class PalindromePartitioning_131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		partition(s);
		System.out.println(partition(s));
	}
	 public static List<List<String>> partition(String s) {
	        List<String> list = new ArrayList<>();
		List<List<String>> ans = new ArrayList<>();
			print(s,list,ans);
			return ans;
			

		}
		public static void print(String ques, List<String> list,List<List<String>> ans) {
			
			if(ques.length() == 0) {
				//System.out.println(list);
				ans.add(new ArrayList<String> (list));
				return;
			}
			
			
			for (int i = 1; i<= ques.length();i++) {
				String s = ques.substring(0,i);
				if(palindrome(s)== true) {
					list.add(s);
				print(ques.substring(i),list,ans);
				list.remove(list.size()-1);
				
			}
			}
		}
		public static boolean palindrome(String s) {
			int i =0;
			int j = s.length()-1;

			while(i<j) {
				if(s.charAt(i)!=s.charAt(j)) {
					return false;
				}
				i++;
				j--;
				}
			return true;
	        
	    }
}
