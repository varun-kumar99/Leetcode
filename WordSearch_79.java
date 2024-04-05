package Leetcode;
import java.util.*;

public class WordSearch_79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char [][]board = new char[n][m];
		for(int i =0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				board[i][j] =sc.next().charAt(0);
			}
		}
		 String word = sc.next();
		 System.out.println(exist(board,word));

	}
	 public static  boolean exist(char[][] board, String word) {
	        int m = board.length;
	        int n = board[0].length;

	        boolean[][] visited = new boolean[m][n];
	        boolean result = false;
	        
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                if (board[i][j] == word.charAt(0)) {
	                    result = backtrack(board, word, visited, i, j, 0);
	                    if (result) return true;
	                }
	            }
	        }
	        
	        return false;
	    }
	    
	    private static boolean backtrack(char[][] board, String word, boolean[][] visited, int i, int j, int index) {
	        if (index == word.length()) {
	            return true;
	        }
	        
	        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] || board[i][j] != word.charAt(index)) {
	            return false;
	        }
	        
	        visited[i][j] = true;
	        
	        if (backtrack(board, word, visited, i + 1, j, index + 1) ||
	            backtrack(board, word, visited, i - 1, j, index + 1) ||
	            backtrack(board, word, visited, i, j + 1, index + 1) ||
	            backtrack(board, word, visited, i, j - 1, index + 1)) {
	            return true;
	        }
	        
	        visited[i][j] = false;
	        return false;
	    }

}
