package linkedList;

public class RemoveDuplicatesfromSortedListII {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode nn = new ListNode(0, head);
		ListNode curr = nn;
		ListNode ahead = nn.next;
		while (true) { 
			if (curr.val == ahead.val) {
				ahead = ahead.next;
			} else {
				curr.next = ahead;
			}
		}

	}

}
