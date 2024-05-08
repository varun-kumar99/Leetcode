package Leetcode;
import java.util.*;
public class WordBreak_139 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public boolean wordBreak(String s, List<String> wordDict) {

	        Set<String> dict = new HashSet<>(wordDict);

	        int n = s.length();

	        boolean[] dp = new boolean[n + 1];

	        dp[0] = true;

	        for (int i = 1; i <= n; ++i) {

	            for (int j = 0; j < i; ++j) {

	                if (dp[j] && dict.contains(s.substring(j, i))) {

	                    dp[i] = true;

	                    break;

	                }

	            }

	        }

	        return dp[n];
	  }

}
