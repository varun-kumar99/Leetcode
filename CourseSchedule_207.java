package Leetcode;
import java.util.*;
public class CourseSchedule_207 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] arr = new int[n][n];
		for(int i = 0; i<n;i++) {
			for(int j=0; j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(canFinish(n,arr));

	}
	 public static boolean canFinish(int n, int[][] prerequisites) {
         List<Integer>[] adj = new List[n];
        int[] indegree = new int[n];
        List<Integer> ans = new ArrayList<>();

        for (int[] pair : prerequisites) {
            int course = pair[0];
            int prerequisite = pair[1];
            if (adj[prerequisite] == null) {
                adj[prerequisite] = new ArrayList<>();
            }
            adj[prerequisite].add(course);
            indegree[course]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        while (!queue.isEmpty()) {
            int current = queue.poll();
            ans.add(current);

            if (adj[current] != null) {
                for (int next : adj[current]) {
                    indegree[next]--;
                    if (indegree[next] == 0) {
                        queue.offer(next);
                    }
                }
            }
        }

        return ans.size() == n;
    }

}
