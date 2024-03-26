package Leetcode;

import java.util.Scanner;

public class PlusOne_66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int [] digit = new int[n];
	    for (int i =0; i<n; i++) {
	    	digit[i] = sc.nextInt();
	    }
	    
	    System.out.println(plusOne(digit));

	}
	 public  static int[] plusOne(int[] digit) {
	        if (digit.length == 0 )
	            return new int[0];
	        
	        int carry = 1;
	        for ( int i = digit.length-1; i>=0; i--){
	            int sum = digit[i]+carry;
	            if( sum>=10){
	                carry = 1;
	            }
	            else{
	                carry = 0;
	            }
	            digit[i]=sum%10;
	                
	        }
	        if(carry == 1){
	            int[] result = new int [digit.length + 1];
	            System.arraycopy(digit , 0 , result , 1, digit.length);
	            result[0] = 1;
	            return result;
	        }
	        else{
	            return digit;
	        }
	        
	    }

}
