package linkedList;

public class RemoveNthNodeFromEndofList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode curr = head;

		ListNode fast = head;
		for (int i = 1; i <= n; i++) {
			fast = fast.next;
		}

		while (fast.next != null) {
			fast = fast.next;
			curr = curr.next;
		}

		curr.next = curr.next.next;
		return head;
	}
}
