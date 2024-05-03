package Leetcode;
import java.util.*;
import java.util.Scanner;

public class Candy_135 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []ratings = new int[n];
		for(int i =0; i<n; i++) {
			ratings[i] = sc.nextInt();
		}
		System.out.println(candy(ratings));

	}
	  public static int candy(int[] ratings) {
	         int n = ratings.length;
	        int[] candies = new int[n];
	        Arrays.fill(candies, 1);

	        for (int i = 1; i < n; i++) {
	            if (ratings[i] > ratings[i - 1]) {
	                candies[i] = candies[i - 1] + 1;
	            }
	        }

	        for (int i = n - 2; i >= 0; i--) {
	            if (ratings[i] > ratings[i + 1]) {
	                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
	            }
	        }

	        int totalCandies = 0;
	        for (int candy : candies) {
	            totalCandies += candy;
	        }

	        return totalCandies;
	    }

}
