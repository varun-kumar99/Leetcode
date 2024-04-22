package Leetcode;
import java.util.*;
public class DistinctSubsequences_115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		System.out.println(numDistinct(s,t));
	}
	 public static int numDistinct(String s, String t) {
         int m = s.length();
        int n = t.length();
        
        int[] dp=new int[n+1];
        dp[0] = 1;
        
        for(int i=1; i<=m; i++){
            for(int j=n; j>=1; j--){
                if(s.charAt(i-1) == t.charAt(j-1))
                    dp[j] = dp[j-1] + dp[j];
            }
        }
        return dp[n];
    }

}
