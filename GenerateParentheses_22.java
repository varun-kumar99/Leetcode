package Leetcode;
import java.util.*;
public class GenerateParentheses_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(generateParenthesis( n));
	}
	 public static List<String> generateParenthesis(int n) {
	        List<String> res = new ArrayList<String>();
	        recurse(res, 0, 0, "", n);
	        return res;
	    }
	    
	    public static void recurse(List<String> res, int left, int right, String s, int n) {
	        if (s.length() == n * 2) {
	            res.add(s);
	            return;
	        }
	        
	        if (left < n) {
	            recurse(res, left + 1, right, s + "(", n);
	        }
	        
	        if (right < left) {
	            recurse(res, left, right + 1, s + ")", n);
	        }
	    }

}
