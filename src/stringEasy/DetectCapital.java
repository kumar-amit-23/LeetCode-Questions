package stringEasy;

public class DetectCapital {
	public boolean detectCapitalUse(String word) {
		int capital = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')
				capital++;
		}

		if (capital == word.length() || capital == 0)
			return true;

		if (capital == 1 && (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z'))
			return true;
		return false;
	}
}
