package linkedList;

public class SwapNodesinPairs {
	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null)
			return head;

		ListNode tempHead = head.next;
		ListNode prev = null;
		swaps(head, prev);
		return tempHead;
	}

	private void swaps(ListNode head, ListNode prev) {
		// TODO Auto-generated method stub
		if ((head == null) || (head.next == null))
			return;
		ListNode temp = head.next;
		head.next = head.next.next;
		temp.next = head;
		head = temp;
		if (prev != null)
			prev.next = head;
		swaps(head.next.next, head.next);

	}

}
