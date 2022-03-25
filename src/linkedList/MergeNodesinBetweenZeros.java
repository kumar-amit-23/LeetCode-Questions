package linkedList;

public class MergeNodesinBetweenZeros {
	public ListNode mergeNodes(ListNode head) {
		ListNode first = head;
		ListNode curr = head.next;
		int sum = 0;
		while (curr != null) {
			sum += curr.val;
			if (curr.val == 0) {
				curr.val = sum;
				first.next = curr;
				first = first.next;
				sum = 0;
			}
			curr = curr.next;
		}

		return head.next;
	}

}
