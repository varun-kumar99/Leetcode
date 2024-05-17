package Leetcode;
import java.util.*;
public class ExcelSheetColumnTitle_168 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(convertToTitle(n));
		

	}
	public static String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();
      
      while(columnNumber > 0) {
          columnNumber--;
          ans.append((char)((columnNumber) % 26 + 'A'));
          columnNumber = (columnNumber) / 26;
      }
      
      return ans.reverse().toString();
  }

}
