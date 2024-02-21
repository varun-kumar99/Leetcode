package Leetcode;
import java.util.*;
public class LetterCombination_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	 String digits = sc.next();
	 System.out.println(letterCombinations( digits));

	}
	 private static List<String> solve(String digits, String[] arr) {
	        if (digits.length() == 0) {
	            List<String> bs = new ArrayList<>();
	            bs.add("");
	            return bs;
	        }

	        char c = digits.charAt(0);
	        String a = arr[c - '0'];
	        String smallinput = digits.substring(1);
	        List<String> rest = solve(smallinput, arr);
	        List<String> res = new ArrayList<>();
	        for (String x : rest) {
	            for (char x1 : a.toCharArray()) {
	                res.add(x1 + x);
	            }
	        }
	        return res;
	    }

	    private static List<String> ans = new ArrayList<>();

	    private static void solve2(String digits, String[] arr, int i, String com) {
	        if (i == digits.length()) {
	            ans.add(com);
	            return;
	        }
	        char c = digits.charAt(i);
	        String a = arr[c - '0'];
	        for (char x1 : a.toCharArray()) {
	            solve2(digits, arr, i + 1, com + x1);
	        }
	    }

	    public static List<String> letterCombinations(String digits) {
	        List<String> a = new ArrayList<>();
	        if (digits.length() == 0)
	            return a;
	        String[] arr = {"0", "0", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	        solve2(digits, arr, 0, "");
	        return ans;
	        
	    }
}
