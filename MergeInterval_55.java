package Leetcode;

import java.util.*;

public class MergeInterval_55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    int arr [] []= new int[n][m];
	    for(int i = 0; i<n;i++) {
	    	for(int j=0;j<m;j++) {
	    		sc.nextInt();
	    	}
	    }
	    System.out.println(merge(arr));
	}
	   public static int[][] merge(int[][] intervals) {
	        List<int[]> answer = new ArrayList<>();
	        
	        if(intervals.length != 0 || intervals != null){
	            Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
	            
	            int start = intervals[0][0];
	            int end = intervals[0][1];
	            for(int[] i: intervals){
	                if(i[0] <= end){
	                    end = Math.max(end, i[1]);
	                } else {
	                    answer.add(new int[]{start,end});
	                    start = i[0];
	                    end = i[1];
	                }
	            }
	            answer.add(new int[]{start,end}); 
	            
	        }
	        
	        return answer.toArray(new int[0][]); 

}
}
