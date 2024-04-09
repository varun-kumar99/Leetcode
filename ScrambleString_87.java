package Leetcode;

import java.util.*;

public class ScrambleString_87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println(isScramble(s1,s2));

	}
	   public static boolean isScramble(String s1, String s2) {
	        if (s1.equals(s2)) {
	            return true;
	        }
	        if (!Arrays.equals(s1.chars().sorted().toArray(), s2.chars().sorted().toArray())) {
	            return false;
	        }
	        
	        int n = s1.length();
	        boolean[][][] dp = new boolean[n][n][n+1];
	        
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                dp[i][j][1] = (s1.charAt(i) == s2.charAt(j));
	            }
	        }
	        
	        for (int length = 2; length <= n; length++) {
	            for (int i = 0; i <= n-length; i++) {
	                for (int j = 0; j <= n-length; j++) {
	                    for (int k = 1; k < length; k++) {
	                        if ((dp[i][j][k] && dp[i+k][j+k][length-k]) || (dp[i][j+length-k][k] && dp[i+k][j][length-k])) {
	                            dp[i][j][length] = true;
	                            break;
	                        }
	                    }
	                }
	            }
	        }
	        
	        return dp[0][0][n];
	    }

}
