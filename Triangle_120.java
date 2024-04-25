package Leetcode;
import java.util.*;

public class Triangle_120 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRows = sc.nextInt();
        List<List<Integer>> triangles = new ArrayList<>();
        sc.nextLine(); // Consume newline character after reading numRows

        for (int i = 0; i < numRows; i++) {
            String[] values = sc.nextLine().trim().split("\\s+");
            List<Integer> row = new ArrayList<>();
            for (String value : values) {
                row.add(Integer.parseInt(value));
            }
            triangles.add(row);
        }
        sc.close(); // Close scanner after reading input

        Triangle_120 solution = new Triangle_120();
        int minTotal = solution.minimumTotal(triangles);
        System.out.println(minTotal);
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int[] A = new int[triangle.size() + 1];
        for (int i = triangle.size() - 1; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                A[j] = Math.min(A[j], A[j + 1]) + triangle.get(i).get(j);
            }
        }
        return A[0];
    }
}
