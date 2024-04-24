package Leetcode;
import java.util.*;
public class PascalsTriangle2_119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(getRow(n));

	}
	 public static List<Integer> getRow(int rowIndex) {
	        List row = new ArrayList<>();

	    double ncr = 1.0;
	    for(int i = 0; i <= rowIndex; i++){
	        row.add((int)ncr);
	        ncr = (ncr * (rowIndex - i)) / (i+1);
	    }
	    return row;

}
}
