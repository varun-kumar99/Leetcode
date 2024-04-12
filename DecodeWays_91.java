package Leetcode;
import java.util.*;
public class DecodeWays_91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String s = sc.next();
		System.out.println(numDecodings(s));
		

	}
	public static int numDecodings(String s) {
        int[] memo = new int[s.length()];
        Arrays.fill(memo, -1);
        return topDownDecode(s, 0, memo);
    }

    private static int topDownDecode(String s, int index, int[] memo) {
        // Base case: if the index reaches the end of the string
        if (index == s.length()) {
            return 1; // This is a valid decoding
        }

        // Check memoization table
        if (memo[index] != -1) {
            return memo[index];
        }

        // Check for leading zero
        if (s.charAt(index) == '0') {
            return 0; // This decoding is invalid
        }

        // Decode single digit
        int ways = topDownDecode(s, index + 1, memo);

        // Decode two digits if possible
        if (index + 1 < s.length() && Integer.parseInt(s.substring(index, index + 2)) <= 26) {
            ways += topDownDecode(s, index + 2, memo);
        }

        // Memoize the result
        memo[index] = ways;

        return ways;
        
    }

}
