package Leetcode;
import java.util.*;
import java.util.Scanner;

public class BitwiseANDofNumbersRange_201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int left = sc.nextInt();
		int right = sc.nextInt();
		System.out.println(rangeBitwiseAnd(left,right));

	}
	public static  int rangeBitwiseAnd(int left, int right) {
        int rightShiftCnt = 0;
        while(left != right){
            left = left >> 1;
            right = right >> 1;
            rightShiftCnt++;
        }
        int commonPref = (right << rightShiftCnt);
        return commonPref;
  }

}
