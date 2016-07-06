package remove_duplicates_from_sorted_list;

public class DeleteDuplicates {
	
	/**
	* Definition for singly-linked list.
	*/
	 public class ListNode {
	     public int val;
	     public ListNode next;
	     public ListNode(int x) { val = x; }
	 }
	
//	83. Remove Duplicates from Sorted List
//	Given a sorted linked list, delete all duplicates such that each element appear only once.
//
//	For example,
//	Given 1->1->2, return 1->2.
//	Given 1->1->2->3->3, return 1->2->3.
	public static ListNode deleteDuplicates(ListNode head) {
			ListNode phead = head;
			while(phead != null) {
				if (phead.next != null && phead.val == phead.next.val) {
					phead.next = phead.next.next;
				}
				else phead = phead.next;
			}
			
			return head;
    	}

}
