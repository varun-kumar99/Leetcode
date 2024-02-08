package Leetcode;
import java.util.*;
public class Valid_parentheses_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(isvalid(str));
		

	}
	 public static boolean isvalid(String str) {
		 Stack<Character> st = new Stack<>();
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (ch == '(' || ch == '{' || ch == '[') {
					st.push(ch);
				} else {
					if (st.isEmpty()) {
						return false;
					}
					if (ch == ')') {
						if (st.peek() == '(') {
							st.pop();
						} else {
							return false;
						}
					}
					if (ch == '}') {
						if (st.peek() == '{') {
							st.pop();
						} else {
							return false;
						}
					}
					if (ch == ']') {
						if (st.peek() == '[') {
							st.pop();
						} else {
							return false;
						}
					}

				}

			}
			return st.isEmpty();
 }
}


