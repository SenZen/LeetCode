package cycle;

public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
    	if(head == null) return false;
    	ListNode walker = head;
    	ListNode runner = head;
    	while(walker.next != null && runner.next.next != null) {
    		walker = walker.next;
    		runner = runner.next.next;
    		if(walker == runner) return true;
    	}
    	return false;
    }

}


//  Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 