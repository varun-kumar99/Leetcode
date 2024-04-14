package Leetcode;

public class ReverseLinkedList2_92 {
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	  public ListNode reverseBetween(ListNode head, int left, int right) {
	        if(left==right)
	        {
	            return head;
	        }
	        ListNode present=head;
	        ListNode prev=null;
	        for(int i=0;present!=null && i<left-1;i++)
	        {
	            prev=present;
	            present=present.next;
	        }
	        //by the time it ends 
	        ListNode last=prev;
	        ListNode newend=present;
	        ListNode next=present.next;
	        for(int i=0;present!=null && i<right-left+1;i++)
	        {
	            present.next=prev;
	            prev=present;
	            present=next;
	            if(next!=null)
	                next=next.next;
	        }
	        if(last!=null)
	        {
	            last.next=prev;
	        }
	        else
	        {
	            head=prev;
	        }
	        newend.next=present;
	        return head;
	    }
	 
}
