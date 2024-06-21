package Leetcode;
import java.util.*;
public class GrumpyBookStoreOwner_1052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		

	}
	public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int maxunsat = 0;
        int currunsat = 0;
        for(int i = 0; i< minutes;i++){
            currunsat+= customers[i] * grumpy[i];
            maxunsat = currunsat;
        }
        int i =0;
        int j = minutes;

        while(j<n){
            currunsat+= customers[j] * grumpy[j];
            currunsat-= customers[i] * grumpy[i];
            maxunsat = Math.max(maxunsat,currunsat);
            i++;
            j++;
        }

        int totalsat = maxunsat;
        for( i = 0; i<n; i++){
            totalsat+= customers[i] * (1- grumpy[i]);
        }

        return totalsat;


    }

}
