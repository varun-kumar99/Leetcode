package Leetcode;
import java.util.*;
public class PowerOfTwo_231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isPowerOfTwo(n));
	}
	 public static boolean isPowerOfTwo(int n) {
         if (n < 1) {
            return false;
        }

        while (n >= 2) {
            if ((n % 2 != 0 && n != 1)) {
                return false;
            }

            n = n / 2;
        }

        return true;
    }

}
