package Leetcode;

import java.util.Scanner;

public class CountPrimes_204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(countPrimes(n));

	}
	 public static int countPrimes(int n) {
	        boolean[] notPrime = new boolean[n];
	        int counter = 0;
	        for (int i = 2; i < n; i++){
	            if (!notPrime[i]) {
	                counter++;
	                for (int j = 2; i * j < n; j++) {
	                    notPrime[i*j] = true;
	                }
	            }
	        }
	        return counter;
	    }
	 

}
