package stack;

import java.util.Stack;

public class ValidParenthesisString {
	public boolean checkValidString(String s) {
		Stack<Integer> leftstack = new Stack<>();
		Stack<Integer> starstack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch == '(')
				leftstack.push(i);
			else if (ch == '*') {
				starstack.push(i);
			} else {
				if (!leftstack.isEmpty()) {
					leftstack.pop();
				} else if (!starstack.isEmpty()) {
					starstack.pop();
				} else {
					return false;
				}
			}
		}

		while (!leftstack.isEmpty()) {
			if (starstack.isEmpty())
				return false;

			if (starstack.pop() > leftstack.pop())
				continue;
			else
				return false;
		}

		return true;

	}
}
