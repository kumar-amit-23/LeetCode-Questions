package stack;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
	public String removeDuplicates(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (!stack.isEmpty() && stack.peek() == s.charAt(i)) {
				stack.pop();
			} else {
				stack.push(s.charAt(i));
			}
		}

		String ans = "";
		for (int i = 0; i < stack.size(); i++)
			ans += stack.get(i);
		return ans;
	}

}
