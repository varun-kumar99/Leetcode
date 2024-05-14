package Leetcode;
import java.util.*;
public class EvaluateReversePolishNotation_150 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String tokens[] = new String[n];
		for(int i =0; i< n;i++) {
			tokens[i] = sc.next();
		}
		System.out.println(evalRPN(tokens));

	}
	 public static int evalRPN(String[] tokens) {
         int[] stack = new int[tokens.length];
        int top = 0;
        for(String s : tokens) {
            char c = s.charAt(0);
            if(c=='+') {
                int b = stack[--top];
                int a = stack[--top];
                stack[top++] = a+b;
            } else if(c=='-' && s.length()==1) {
                int b = stack[--top];
                int a = stack[--top];
                stack[top++] = a-b;
            } else if(c=='*') {
                int b = stack[--top];
                int a = stack[--top];
                stack[top++] = a*b;
            } else if(c=='/') {
                int b = stack[--top];
                int a = stack[--top];
                stack[top++] = a/b;
            } else 
                stack[top++] = Integer.parseInt(s);
        }
        return stack[0];
    }

}
