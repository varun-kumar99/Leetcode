package Leetcode;
import java.util.*;
public class GroupAnagrams_49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 String[] strs = new String[n];
	        for (int i = 0; i < n; i++) {
	            strs[i] = sc.next();
	        }
		 List<List<String>> anagrams = groupAnagrams(strs);
		 System.out.println(anagrams);
	}
	
	 public static String getSignature(String s) {
	        int[] count = new int[26];
	        for (char c : s.toCharArray()) {
	            count[c - 'a']++;
	        }

	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < 26; i++) {
	            if (count[i] != 0) {
	                sb.append((char) ('a' + i)).append(count[i]);
	            }
	        }
	        return sb.toString();
	    }

	    public  static List<List<String>> groupAnagrams(String[] strs) {
	        List<List<String>> result = new ArrayList<>();
	        Map<String, List<String>> groups = new HashMap<>();

	        for (String s : strs) {
	            groups.computeIfAbsent(getSignature(s), k -> new ArrayList<>()).add(s);
	        }

	        result.addAll(groups.values());

	        return result;
	    }
}
