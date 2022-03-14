package linkedList;

public class NextGreaterNodeInLinkedList {
	public int[] nextLargerNodes(ListNode head) {

		ListNode curr = head;
		int size = 0;
		while (curr != null) {
			curr = curr.next;
			size++;
		}
		curr = head;
		int idx = 0;
		int[] arr = new int[size];
		while (curr != null) {
			ListNode temp = curr.next;
			while (temp != null) {
				if (temp.val > curr.val) {
					arr[idx++] = temp.val;
					break;
				}
				temp = temp.next;
			}
			if (temp == null)
				arr[idx++] = 0;
			curr = curr.next;
		}
		return arr;

	}

}
