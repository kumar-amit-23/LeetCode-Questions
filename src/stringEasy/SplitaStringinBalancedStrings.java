package stringEasy;

public class SplitaStringinBalancedStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int balancedStringSplit(String s) {
		int sum = 0;
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			sum = sum + ((s.charAt(i) == 'L') ? 1 : -1);
			if (sum == 0)
				count++;
		}
		return count;
	}

}
