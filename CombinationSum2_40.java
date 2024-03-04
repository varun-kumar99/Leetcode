package Leetcode;

import java.util.*;

public class CombinationSum2_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		System.out.println(combinationSum2(A, target));

	}

	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		Arrays.sort(candidates);
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		print(candidates, target, list, ans, 0);
		return ans;

	}

	public static void print(int[] ques, int target, List<Integer> list, List<List<Integer>> ans, int idx) {
		if (target == 0) {
			ans.add(new ArrayList<Integer>(list));
			return;
		}
		for (int i = idx; i < ques.length; i++) {
			if (i != idx && ques[i] == ques[i - 1]) {
				continue;
			}
			if (target >= ques[i]) {
				list.add(ques[i]);
				print(ques, target - ques[i], list, ans, i + 1);
				list.remove(list.size() - 1);

			}
		}
	}

}
