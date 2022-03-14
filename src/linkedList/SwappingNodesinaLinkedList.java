package linkedList;

public class SwappingNodesinaLinkedList {
	public ListNode swapNodes(ListNode head, int k) {
		ListNode slow = head;
		ListNode fast = head;

		for (int i = 1; i < k; i++) {
			fast = fast.next;
		}

		ListNode kthNodefromBeg = fast;
		fast = fast.next;
		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}

		ListNode kthNodefromEnd = slow;
		int temp = kthNodefromBeg.val;
		kthNodefromBeg.val = kthNodefromEnd.val;
		kthNodefromEnd.val = temp;

		return head;
	}
}
