package linkedList;

import java.util.ArrayList;

public class PalindromeLinkedList {
	public boolean isPalindrome(ListNode head) {
//		Stack<Integer> stack = new Stack<>();
		ArrayList<Integer> list = new ArrayList<>();
		ListNode curr = head;
		while (curr != null) {
//			stack.push(curr.val);
			list.add(curr.val);
			curr = curr.next;
		}

		int left = 0;
		int right = list.size() - 1;
		while (left < right) {
			if (list.get(left) == list.get(right)) {
				left++;
				right--;
			} else {
				return false;
			}
		}

		return true;
	}

}
