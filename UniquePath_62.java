package Leetcode;

import java.util.Scanner;

public class UniquePath_62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int m = sc.nextInt();
	    int n = sc.nextInt();
	    System.out.println(uniquePaths( m, n));

	}
	 public static int uniquePaths(int m, int n) {
         if(m == 1 || n == 1)
            return 1;
        m--;
        n--;
        if(m < n) {              // Swap, so that m is the bigger number
            m = m + n;
            n = m - n;
            m = m - n;
        }
        long res = 1;
        int j = 1;
        for(int i = m+1; i <= m+n; i++, j++){       // Instead of taking factorial, keep on multiply & divide
            res *= i;
            res /= j;
        }
            
        return (int)res;
    }

}
