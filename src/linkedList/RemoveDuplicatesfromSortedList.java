package linkedList;

public class RemoveDuplicatesfromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null)
			return null;

		ListNode curr = head;
		ListNode ahead = curr.next;

		while (ahead != null) {

			if (curr.val == ahead.val) {
				curr.next = ahead.next;
				ahead = ahead.next;
			} else {
				curr = ahead;
				ahead = ahead.next;
			}

		}

		return head;

	}

}
