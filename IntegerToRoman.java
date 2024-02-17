package Leetcode;
import java.util.*;
public class IntegerToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(intToRoman(n));

	}
	public static String intToRoman(int num) {
		  String roman = "";
	        int[] storeInt = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	        String[] storeRoman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	        for (int i = 0; i < storeInt.length; i++) {
	            while (num >= storeInt[i]) {
	                roman += storeRoman[i];
	                num -= storeInt[i];
	            }
	        }
	        
	        return roman;
   }

}
