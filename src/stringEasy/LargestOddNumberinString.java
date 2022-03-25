package stringEasy;

public class LargestOddNumberinString {
	public String largestOddNumber(String num) {
		int max_odd = 0;
		for (int i = 0; i < num.length(); i++) {
			int digit = num.charAt(i) - '0';
			if (digit % 2 == 1 && (digit > max_odd)) {
				max_odd = digit;
			}
		}

		if (max_odd == 0)
			return "";
		return max_odd + "";
	}
}
