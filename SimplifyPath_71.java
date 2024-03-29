package Leetcode;

import java.util.*;

public class SimplifyPath_71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String path = sc.next();
		System.out.println(simplifyPath(path));

	}
	public static String simplifyPath(String path) {
		Deque<String> dir_stack = new ArrayDeque<>();
		        for (String dir : path.split("/")) {
		            if (!dir_stack.isEmpty() && dir.equals("..")) {
		                dir_stack.removeLast();
		            } else if (!dir.equals(".") && !dir.equals("") && !dir.equals("..")) {
		                dir_stack.addLast(dir);
		            }
		        }
		        StringBuilder simplified_path = new StringBuilder();
		        for (String dir : dir_stack) {
		            simplified_path.append("/").append(dir);
		        }
		        return simplified_path.length() == 0 ? "/" : simplified_path.toString();

}
}
