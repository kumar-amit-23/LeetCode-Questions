package stringEasy;

public class MaximumNestingDepthoftheParentheses {
	public int maxDepth(String s) {
		int left = 0;
		int max = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(')
				left++;
			if (s.charAt(i) == ')')
				left--;
			max = Math.max(max, left);
		}
		return max;
	}

}
