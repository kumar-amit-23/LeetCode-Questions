package linkedList;

public class GetDecimalValue {
	public int getDecimalValue(ListNode head) {
		ListNode curr = head;
		int count = 0;
		int base = 2;
		int ans = 0;

		while (curr != null) {
			count++;
			curr = curr.next;
		}
		curr = head;
		while (curr != null) {
			int val = curr.val;
			ans = (int) (ans + (int) val * (Math.pow(base, count - 1)));
			count--;
			curr = curr.next;
		}

		return ans;

	}

}
