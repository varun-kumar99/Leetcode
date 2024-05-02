package Leetcode;
import java.util.*;
public class GasStation_134 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []gas = new int[n];
		for(int i =0; i<n; i++) {
			gas[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int [] cost = new int[m];
		for(int j =0; j<n; j++) {
			cost[j] = sc.nextInt();
		}
		System.out.println(canCompleteCircuit(gas,cost));
	}
	public static int canCompleteCircuit(int[] gas, int[] cost) {
        int net = 0;
		int curr = 0;
		int si = 0;
		for (int i = 0; i < gas.length; i++) {
			net = net + (gas[i] - cost[i]);
			curr += (gas[i] - cost[i]);
			if (curr < 0) {
				si = i + 1;
				curr = 0;
			}
		}

		if (net < 0) {
			return -1;
		}

		return si;

        
    }

}
