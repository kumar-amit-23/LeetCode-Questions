package finalValueofVariableAfterPerformingOperations;

public class Solution {
	public int finalValueAfterOperations(String[] operations) {
		int count = 0;
		for (String opr : operations) {
			if (opr.equals("X++") || opr.equals("++X")) {
				count++;
			} else {
				count--;
			}
		}
		return count;
	}
}
