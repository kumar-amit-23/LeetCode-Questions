package recursion;

public class ReverseString {
	public void reverseString(char[] s) {
		reverseStringRecursive(s, 0, s.length - 1);
	}

	public void reverseStringRecursive(char[] s, int si, int end) {
		if (si >= end)
			return;
		char temp = s[si];
		s[si] = s[end];
		s[end] = temp;
		reverseStringRecursive(s, si + 1, end - 1);

	}
}
