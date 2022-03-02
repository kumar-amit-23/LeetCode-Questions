package partitioningIntoMinimumNumberOfDeciBinaryNumbers;

public class Solution {
	public int minPartitions(String n) {
		int result = 0;
		for (int i = 0; i < n.length(); i++) {
			result = (result < n.charAt(i) - '0') ? n.charAt(i) - '0' : result;
			if (result == 9)
				return 9;
		}
		return result;
	}
}
