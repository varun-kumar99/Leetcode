package Leetcode;

import java.util.Scanner;

public class pow_xn_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(myPow( x, n));

	}
	  public static double solve(double x, long n) {
	        if (n == 0) {
	            return 1; // power of 0 is 1
	        }
	        double temp = solve(x, n / 2);
	        temp = temp * temp;

	        if (n % 2 == 0) { 
	            return temp;
	        } else {
	            return temp * x; 
	        }
	    }

	    public static double myPow(double x, int n) {
	        long longN = n; 
	        double ans = solve(x, Math.abs(longN));

	        if (longN < 0) {
	            return 1 / ans;
	        }
	        return ans;
	    }

}
