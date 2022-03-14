package linkedList;

public class DeletetheMiddleNodeofaLinkedList {
	public ListNode deleteMiddle(ListNode head) {
		if (head == null || head.next == null)
			return null;

		ListNode prev = null;
		ListNode curr = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			prev = curr;
			curr = curr.next;
			fast = fast.next.next;
		}

		prev.next = curr.next;
		return head;
	}
}
