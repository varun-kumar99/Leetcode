package Leetcode;
import java.util.*;
public class LongestSubstring_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
		String str = sc.next();
		System.out.println(LongestSubstring(str));
	}
	 public static int LongestSubstring(String s) {
	        int n = s.length();
	        int maxLength = 0;
	        Set<Character> charSet = new HashSet<>();
	        int left = 0;
	        
	        for (int right = 0; right < n; right++) {
	            if (!charSet.contains(s.charAt(right))) {
	                charSet.add(s.charAt(right));
	                maxLength = Math.max(maxLength, right - left + 1);
	            } else {
	                while (charSet.contains(s.charAt(right))) {
	                    charSet.remove(s.charAt(left));
	                    left++;
	                }
	                charSet.add(s.charAt(right));
	            }
	        }
	        
	        return maxLength;
	
		

	}

}
