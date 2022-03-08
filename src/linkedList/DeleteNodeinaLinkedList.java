package linkedList;

public class DeleteNodeinaLinkedList {
	public void deleteNode(ListNode node) {
		ListNode curr = node;
		ListNode ahead = curr.next;
		curr.val = ahead.val;
		curr.next = ahead.next;

	}

}
