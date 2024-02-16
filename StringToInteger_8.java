package Leetcode;
import java.util.*;
public class StringToInteger_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(myAtoi(str));

	}
	 public static int myAtoi(String s) {
         s = s.trim();
        if (s.length() == 0) {
            return 0;
        }

        int i = 0;
        long num = 0;
        int sign = 1;

        // Check for sign
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i++) == '-') ? -1 : 1;
        }

        // Process digits
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i++) - '0';

            // Check for overflow
            if (num > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            num = num * 10 + digit;
        }

        return (int) (sign * num);
    }

}
