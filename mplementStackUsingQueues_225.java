package Leetcode;
import java.util.*;
public class mplementStackUsingQueues_225 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class MyStack {

	    private Queue<Integer> q = new LinkedList<>();

	    public void push(int x) {
	        q.add(x);
	    }

	    public int pop() {
	        int size = q.size();
	        for (int i = 0; i < size - 1; i++) {
	            push(q.remove());
	        }
	        return q.remove();
	    }

	    public int top() {
	        int size = q.size();
	        for (int i = 0; i < size - 1; i++) {
	            push(q.remove());
	        }
	        int topValue = q.remove();
	        push(topValue);
	        return topValue;
	    }

	    public boolean empty() {
	        return q.isEmpty();
	    }
	}

}
