package Leetcode;
import java.util.*;
public class BestTimetoBuyandSellStock_121 {

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
        int min = prices[0];
       int mp = 0;
        for ( int current : prices){
            min  = Math.min(min,current);
            mp = Math.max(mp,current - min);
        }
       return mp;
   }

}
