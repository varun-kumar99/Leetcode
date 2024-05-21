package Leetcode;
import java.util.*;
public class NumberOfOneBit_191 {

	public static void main(String[] args) {
		// TODO Auto-generated method
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(hammingWeight(n));

	}
	  public static int  hammingWeight(int n) {
	        int setBitCount = 0;
	        
			while (n != 0) {
	            n &= (n - 1);
	            ++setBitCount;
	        }
			
	        return setBitCount;
	    }
}
