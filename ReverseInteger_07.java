package Leetcode;
import java.util.*;
public class ReverseInteger_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(reverse(n));
		

	}
	 public  static int reverse(int x) {
	        int num = Math.abs(x);  
	        
	        int rev = 0;  
	        
	        while (num != 0) {
	            int ld = num % 10; 
	            // Overflow check
	            if (rev > (Integer.MAX_VALUE - ld) / 10) {
	                return 0; 
	            }
	            
	            rev = rev * 10 + ld; 
	            num = num / 10; 
	        }
	        
	        return (x < 0) ? (-rev) : rev;

}
}
