package Leetcode;
import java.util.*;
public class palindrome_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
	System.out.println(isPalindrome(n));
	}
		 public static boolean isPalindrome(int x) {
	          if (x<0 || (x!=0 && x%10==0)) return false;
	    int rev = 0;
	    while (x>rev){
	    	rev = rev*10 + x%10;
	    	x = x/10;
	    }
	    return (x==rev || x==rev/10);

	}

}

