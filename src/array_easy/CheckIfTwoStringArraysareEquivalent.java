package array_easy;

public class CheckIfTwoStringArraysareEquivalent {
	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		String ans = "";
		for (int i = 0; i < word1.length; i++)
			ans += word1[i];
		String ans2 = "";
		for (int i = 0; i < word2.length; i++)
			ans2 += word2[i];

		if (ans.equals(ans2))
			return true;

		return false;

	}
}
