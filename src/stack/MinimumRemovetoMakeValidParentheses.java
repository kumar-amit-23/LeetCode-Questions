package stack;

import java.util.Stack;

public class MinimumRemovetoMakeValidParentheses {
	public String minRemoveToMakeValid(String s) {
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isAlphabetic(ch))
				continue;

			if (ch == '(') {
				stack.push(i);
			} else {
				if (!stack.isEmpty() && s.charAt(stack.peek()) == '(') {
					stack.pop();
				} else {
					stack.push(i);
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (!stack.contains(i))
				sb.append(s.charAt(i));
		}

		return sb.toString();

	}

}
