package linkedList;

public class RemoveLinkedListElements {
	public ListNode removeElements(ListNode head, int val) {
		if (head == null)
			return null;

		ListNode temp = head;
		while (temp.next != null) {
			if (temp.next.val == val)
				temp.next = temp.next.next;
			else
				temp = temp.next;
		}
		if (head.val == val)
			return head.next;

		return head;
	}
}
