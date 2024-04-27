package Leetcode;
import java.util.Scanner;
import java.util.*;
public class BestTimeToBuyAndSelStocks2_122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] prices = new int[n];
		for(int i =0; i<n;i++) {
			prices[i] = sc.nextInt();
		}
		 System.out.println(maxProfit(prices));

	}
	 public static int maxProfit(int[] prices) {
	        int profit =0;
	        for(int i =1;i<prices.length;i++)
	        {
	            if(prices[i]>prices[i-1])
	            {
	                profit=profit+(prices[i]-prices[i-1]);
	            }
	        }
	        return profit;
	    }

}
