package Leetcode;
import java.util.*;
public class ZigZagConversion_06 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	int n = sc.nextInt();
	System.out.println(convert(s,n));
	}
		 public static String convert(String s, int numRows) {
		        if (numRows == 1) {
		            return s;
		        }
		        
		        StringBuilder answer = new StringBuilder();
		        int n = s.length();
		        int diff = 2 * (numRows - 1);
		        int diagonalDiff = diff;
		        int secondIndex;
		        int index;
		        for (int i = 0; i < numRows; i++) {
		            index = i;

		            while (index < n) {
		                answer.append(s.charAt(index));
		                if (i != 0 && i != numRows - 1) {
		                    diagonalDiff = diff-2*i;
		                    secondIndex = index + diagonalDiff;
		                    
		                    if (secondIndex < n) {
		                        answer.append(s.charAt(secondIndex));
		                    }
		                }
		                index += diff;
		            }
		        }
		        
		        return answer.toString();

	}

}
