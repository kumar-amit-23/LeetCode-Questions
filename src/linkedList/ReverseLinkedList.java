package linkedList;

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		if (head == null)
			return null;
		ListNode prev = null;
		ListNode curr = head;
		ListNode ahead = curr.next;

		while (ahead != null) {
			curr.next = prev;
			prev = curr;
			curr = ahead;
			ahead = ahead.next;
		}
		curr.next = prev;
		head = curr;

		return head;

	}

}
